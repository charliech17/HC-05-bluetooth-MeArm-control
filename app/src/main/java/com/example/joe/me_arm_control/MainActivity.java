package com.example.joe.me_arm_control;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button i1,btn,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    TextView t1;

    String address = null , name=null;

    BluetoothAdapter myBluetooth = null;
    BluetoothSocket btSocket = null;
    Set<BluetoothDevice> pairedDevices;
    static final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        try {setw(); } catch (Exception e) {}
    }






    @SuppressLint("ClickableViewAccessibility")
    private void setw() throws IOException {
        t1=(TextView)findViewById(R.id.textView1);
        i1=(Button)findViewById(R.id.button);
        btn=(Button)findViewById(R.id.button3);
        btn2=(Button)findViewById(R.id.button4);
        btn3=(Button)findViewById(R.id.button5);
        btn4=(Button)findViewById(R.id.button6);
        btn5=(Button)findViewById(R.id.button7);
        btn6=(Button)findViewById(R.id.button8);
        btn7=(Button)findViewById(R.id.button2);
        btn8=(Button)findViewById(R.id.button9);

        bluetooth_connect_device();



        i1.setOnTouchListener(new View.OnTouchListener()
        {

            @Override
        public boolean onTouch(View v, MotionEvent event){
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    led_on_off("f");
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    led_on_off("b");

                }


            return true;}
        });


//btn
        btn.setOnTouchListener(new View.OnTouchListener() {
            private Handler mHandler;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction1, 125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction1);
                        mHandler = null;
                        break;
                }

                return false;
            }

            Runnable mAction1 = new Runnable() {
                @Override public void run() {

                        led_on_off("d");

                        mHandler.postDelayed(this, 125);


                }
            };


        });
//btn2
        btn2.setOnTouchListener(new View.OnTouchListener() {
            private Handler myHandler2;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if (myHandler2 != null) return true;
                        myHandler2=new Handler();
                        myHandler2.postDelayed(myAction,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler2==null) return true;
                        myHandler2.removeCallbacks(myAction);
                        myHandler2=null;
                        break;
                }


                return false;
            }

            Runnable myAction=new Runnable() {
                @Override
                public void run() {

                        led_on_off("e");
                        myHandler2.postDelayed(this,125);

                }
            };
        });
//btn3
        btn3.setOnTouchListener(new View.OnTouchListener() {
            private Handler myHandler3;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler3!=null){return true;}
                        myHandler3=new Handler();
                        myHandler3.postDelayed(myAction3,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler3==null){return true;}
                        myHandler3.removeCallbacks(myAction3);
                        myHandler3=null;
                        break;

                }

                return false;
            }
            Runnable myAction3=new Runnable() {
                @Override
                public void run() {
                          led_on_off("a");
                          myHandler3.postDelayed(this,125);
                }
            };

        });
//btn4
        btn4.setOnTouchListener(new View.OnTouchListener() {
           private Handler myHandler4;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler4!=null){return true;}
                        myHandler4=new Handler();
                        myHandler4.postDelayed(myAction4,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler4==null){return true;}
                        myHandler4.removeCallbacks(myAction4);
                        myHandler4=null;
                        break;

                }
                return false;
            }

            Runnable myAction4=new Runnable() {
                @Override
                public void run() {
                    led_on_off("c");
                    myHandler4.postDelayed(this,125);
                }
            };
        });
//btn5
        btn5.setOnTouchListener(new View.OnTouchListener() {
           private Handler myHandler5;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler5!=null){return true;}
                        myHandler5=new Handler();
                        myHandler5.postDelayed(myAction5,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler5==null){return true;}
                        myHandler5.removeCallbacks(myAction5);
                        myHandler5=null;
                        break;

                }
                return false;
            }
            Runnable myAction5=new Runnable() {
                @Override
                public void run() {
                    led_on_off("g");
                    myHandler5.postDelayed(this,125);
                }
            };
        });
//btn6
        btn6.setOnTouchListener(new View.OnTouchListener() {
            private Handler myHandler6;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler6!=null){return true;}
                        myHandler6=new Handler();
                        myHandler6.postDelayed(myAction6,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler6==null){return true;}
                        myHandler6.removeCallbacks(myAction6);
                        myHandler6=null;
                        break;
                }
                return false;
            }
            Runnable myAction6=new Runnable() {
                @Override
                public void run() {
                    led_on_off("h");
                    myHandler6.postDelayed(this,125);
                }
            };

        });
//btn7
        btn7.setOnTouchListener(new View.OnTouchListener() {
            private Handler myHandler7;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler7!=null){return true;}
                        myHandler7=new Handler();
                        myHandler7.postDelayed(myAction7,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler7==null){return true;}
                        myHandler7.removeCallbacks(myAction7);
                        myHandler7=null;
                        break;
                }
                return false;
            }
            Runnable myAction7=new Runnable() {
                @Override
                public void run() {
                    led_on_off("i");
                    myHandler7.postDelayed(this,125);
                }
            };
        });
//btn8
        btn8.setOnTouchListener(new View.OnTouchListener() {
            private Handler myHandler8;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if(myHandler8!=null){return true;}
                        myHandler8=new Handler();
                        myHandler8.postDelayed(myAction8,125);
                        break;
                    case MotionEvent.ACTION_UP:
                        if(myHandler8==null){return true;}
                        myHandler8.removeCallbacks(myAction8);
                        myHandler8=null;
                        break;
                }
                return false;
            }
            Runnable myAction8=new Runnable() {
                @Override
                public void run() {

                    led_on_off("j");
                    myHandler8.postDelayed(this,125);
                }
            };
        });
    }




    private void bluetooth_connect_device() throws IOException {
        try
        {
            myBluetooth = BluetoothAdapter.getDefaultAdapter();
            address = myBluetooth.getAddress();
            pairedDevices = myBluetooth.getBondedDevices();
            if (pairedDevices.size()>0)
            {
                for(BluetoothDevice bt : pairedDevices)
                {
                    address=bt.getAddress().toString();name = bt.getName().toString();
                    Toast.makeText(getApplicationContext(),"Connected", Toast.LENGTH_SHORT).show();

                }
            }

        }catch (Exception ex){}

        myBluetooth = BluetoothAdapter.getDefaultAdapter();//get the mobile bluetooth device
        BluetoothDevice dispositivo = myBluetooth.getRemoteDevice(address);//connects to the device's address and checks if it's available
        btSocket = dispositivo.createInsecureRfcommSocketToServiceRecord(myUUID);//create a RFCOMM (SPP) connection
        btSocket.connect();
        try { t1.setText("BT Name: "+name+"\nBT Address: "+address); }
        catch(Exception e){}

    }

   @Override
    public void onClick(View v)
    {
        try
        {

        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();

        }

    }

    private void led_on_off(String i) {

        try
        {
            if (btSocket!=null)
            {

                btSocket.getOutputStream().write(i.toString().getBytes());
            }

        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

}
