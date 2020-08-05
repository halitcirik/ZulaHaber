package com.zula.zulahaber.ui.karakterler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.zula.zulahaber.ConnectionClass;
import com.zula.zulahaber.R;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Karakterler extends AppCompatActivity {

    ImageView imageView;
    String url ;
    TextView karakterAdi, karakterTur;
    ArrayList<getKarakter> getKarakters=new ArrayList<>();
    RecyclerView recyclerView;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakterler);
        karakterAdi=(TextView) findViewById(R.id.karakterAdi);
        karakterTur=(TextView) findViewById(R.id.karakterTur);
        recyclerView=(RecyclerView) findViewById(R.id.recy_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        linearLayoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
anlamiske;
        /*
        imageView=(ImageView) findViewById(R.id.karakterResim);
        url = "https://cdn.zulaoyun.com/sitecdn/TR/Content/zulaoyun/images/characters/demir.png";
        Picasso.get().load(url).into(imageView);
        */

        karakterGetir();
        CustomAdapter customAdapter=new CustomAdapter(getKarakters,context);
        recyclerView.setAdapter(customAdapter);


    }

    public void karakterGetir(){
        ConnectionClass con=new ConnectionClass();
        Connection conn= con.CONN();
        String storedProcudureCall = "{call ac()};";
        try {
            PreparedStatement serr=conn.prepareStatement("select * from tblKarakterler");
            ResultSet s =serr.executeQuery();
            while (s.next()){
                getKarakters.add(new getKarakter(s.getString("karakterTur"),s.getString("karakterAdi")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}