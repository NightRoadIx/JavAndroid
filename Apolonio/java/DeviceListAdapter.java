package com.example.apolonio;

public class DeviceListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Object> deviceList;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textName, textAddress;
        LinearLayout linearLayout;
        public ViewHolder(View v) {
            super(v);
            textName = v.findViewById(R.id.textViewDeviceName);
            textAddress = v.findViewById(R.id.textViewDeviceAddress);
            linearLayout = v.findViewById(R.id.linearLayoutDeviceInfo);
        }
    }
    public DeviceListAdapter(Context context, List<Object> deviceList) {
        this.context = context;
        this.deviceList = deviceList;
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.device_info_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ViewHolder itemHolder = (ViewHolder) holder;
        final DeviceInfoModel deviceInfoModel = (DeviceInfoModel) deviceList.get(position);
        itemHolder.textName.setText(deviceInfoModel.getDeviceName());
        itemHolder.textAddress.setText(deviceInfoModel.getDeviceHardwareAddress());
        // Cuando un dispositivo es seleccionado
        itemHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity.class);
                // Mandar los detalles de los dispositivos a MainActivity
                intent.putExtra("deviceName", deviceInfoModel.getDeviceName());
                intent.putExtra("deviceAddress",deviceInfoModel.getDeviceHardwareAddress());
                // Llamar MainActivity
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        int dataCount = deviceList.size();
        return dataCount;
    }
}
