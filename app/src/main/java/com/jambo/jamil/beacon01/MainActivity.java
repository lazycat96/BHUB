package com.jambo.jamil.beacon01;

import android.bluetooth.le.AdvertiseSettings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uriio.beacons.Beacons;
import com.uriio.beacons.model.Beacon;
import com.uriio.beacons.model.EddystoneTLM;
import com.uriio.beacons.model.EddystoneUID;
import com.uriio.beacons.model.EddystoneURL;
import com.uriio.beacons.model.iBeacon;

import java.util.jar.Attributes;

import javax.xml.namespace.NamespaceContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Beacons.initialize(this);
        Link.ASCIIToHex.main();

        byte[] UUID = hexStringToByteArray("00000000000000" + Link.ASCIIToHex.main());
        new EddystoneUID( UUID, AdvertiseSettings.ADVERTISE_MODE_BALANCED, AdvertiseSettings.ADVERTISE_TX_POWER_HIGH)
                .start();
        Beacon myUidBeacon = new EddystoneUID(UUID);
        myUidBeacon.edit()
                .setName("Zhami")
                .setAdvertiseMode(AdvertiseSettings.ADVERTISE_MODE_BALANCED)
                .apply();
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

}
