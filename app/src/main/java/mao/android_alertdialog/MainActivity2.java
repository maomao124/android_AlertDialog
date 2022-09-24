package mao.android_alertdialog;


import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("标题")
                .setIcon(R.drawable.ic_launcher_foreground)
                .setMessage("内容")
                .setPositiveButton("确定按钮", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(MainActivity2.this, "点击确定", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消按钮", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(MainActivity2.this, "点击取消", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                })
                .setNeutralButton("中性按钮", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(MainActivity2.this, "暂时不确定", Toast.LENGTH_SHORT).show();
                    }
                })
                .create().show();
    }
}