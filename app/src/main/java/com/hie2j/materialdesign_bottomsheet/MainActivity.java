package com.hie2j.materialdesign_bottomsheet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int STATE_DRAGGING = 1;//手指接触正在移动
    public static final int STATE_SETTLING = 2;//手指释放正在移动
    public static final int STATE_EXPANDED = 3;//展开
    public static final int STATE_COLLAPSED = 4;//收起
    public static final int STATE_HIDDEN = 5;//隐藏
    private static final String TAG = "MainActivity";

    private LinearLayout mBottomSheet;
    private BottomSheetBehavior<LinearLayout> mBottomSheetBehavior;
    private BottomSheetDialog mBottomSheetDialog;

    private boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomSheet = findViewById(R.id.bottom_sheet);
        mBottomSheetBehavior = BottomSheetBehavior.from(mBottomSheet);

        mBottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                Log.e(TAG,"newState = " + i);
            }

            @Override
            public void onSlide(@NonNull View view, float v) {
                Log.e(TAG,"slideOffset = " + v);
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (isOpen){
//                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
//                }else{
//                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//                }
//                isOpen = !isOpen;

                mBottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                mBottomSheetDialog.setContentView(R.layout.a_pome_item);
                mBottomSheetDialog.show();
            }
        });

        findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TV 1 click", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TV 2 click", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tv3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TV 3 click", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tv4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TV 4 click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
