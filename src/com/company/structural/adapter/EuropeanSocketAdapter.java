package com.company.structural.adapter;

public class EuropeanSocketAdapter implements SocketAdapter {

    private Socket socket;

    public EuropeanSocketAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Voltage supplyVoltage() {
        return convertTo220Volt(socket.supplyVoltage());
    }

    private Voltage convertTo220Volt(Voltage voltage) {
        if (voltage.getVoltage() == 230) {
            return new Voltage(220);
        } else {
            return new Voltage(0);
        }
    }
}
