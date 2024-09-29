package com.itschool.library.utils.design_patterns.structural.adapter.example_two;

public class SocketObjectAdapterImpl implements SocketAdapter{

    private final Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

@Override
	public Volt get67Volt() {
		Volt v= socket.getVolt();
		return convertVolt(v,67);
	}

	@Override
	public Volt get32Volt() {
		Volt v= socket.getVolt();
		return convertVolt(v,32);
	}
    private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
