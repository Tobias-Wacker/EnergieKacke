package com.example.android.sidedrawertest.data;

import android.provider.BaseColumns;

public final class DevicesContract {
    private DevicesContract() {}

    public final static class DeviceEntry implements BaseColumns{

        public final static String TABLE_NAME = "devices";

        public final static String _ID = BaseColumns._ID;
        public final static String COLLUMN_DEVICE_NAME = "name";
        public final static String COLLUMN_DEVICE_CONSUMPTION = "conssumption";
        public final static String COLLUMN_DEVICE_TYPE = "type";

        public final static int TYPE_0 = 0;
        public final static int TYPE_1 = 1;
        public final static int TYPE_2 = 2;

    }

}
