package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasday6.Item;
import android.content.ClipData;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        getData();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        itemAdapter = new ItemAdapter(items);
        recyclerView.setAdapter(itemAdapter);
    }

    private void getData() {
        items = new ArrayList<>();
        items.add(new Item("Mie Sedaap Ayam Bawang", R.drawable.item1, "Mie Sedaap Ayam Bawang adalah mie instan dengan rasa ayam bawang yang lezat. Setiap suapannya membangkitkan kenangan akan masakan rumahan. Rasakan kenikmatannya dengan harga terjangkau.", "Rp 3.500"));
        items.add(new Item("Mie Sedaap Mie Goreng", R.drawable.item2, "Mie Sedaap Mie Goreng adalah mie instan dengan cita rasa mie goreng yang khas. Dibumbui dengan rempah pilihan, setiap suapan memberikan kenikmatan yang tak terlupakan. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 2.000"));
        items.add(new Item("Mie Sedaap Korea Spicy Chicken", R.drawable.item3, "Mie Sedaap Korea Spicy Chicken adalah mie instan dengan rasa pedas ala Korea yang menggugah selera. Dibuat dengan bumbu khusus, setiap suapan membawa Anda ke negeri ginseng. Rasakan kelezatannya dengan harga terjangkau.", "Rp 2.500"));
        items.add(new Item("Mie Sedaap White Curry", R.drawable.item4, "Mie Sedaap White Curry adalah mie instan dengan kuah kari putih yang lezat. Dibuat dengan rempah pilihan, setiap suapan membawa Anda ke negeri kari yang autentik. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 8.000"));
        items.add(new Item("Mie Sedaap Rasa Soto", R.drawable.item5, "Mie Sedaap Rasa Soto adalah mie instan dengan kuah soto yang kaya rempah. Dibuat dengan bumbu khas Indonesia, setiap suapan membawa Anda merasakan kenikmatan masakan Nusantara. Rasakan kelezatannya dengan harga terjangkau.", "Rp 1.500"));
        items.add(new Item("Indomie Goreng", R.drawable.item6, "Indomie Goreng adalah mie instan goreng yang lezat dan praktis. Dibumbui dengan rempah pilihan, setiap suapan membawa Anda merasakan kelezatan masakan Indonesia. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 2.600"));
        items.add(new Item("Indomie Ayam Bawang", R.drawable.item7, "Indomie Ayam Bawang adalah mie instan dengan rasa ayam bawang yang khas. Dibumbui dengan rempah pilihan, setiap suapan memberikan kenikmatan yang tak terlupakan. Rasakan kelezatannya dengan harga terjangkau.", "Rp 2.700"));
        items.add(new Item("Indomie Soto Mie", R.drawable.item8, "Indomie Soto Mie adalah mie instan dengan kuah soto yang gurih. Dibumbui dengan rempah pilihan, setiap suapan membawa Anda terbang ke negeri soto yang autentik. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 2.700"));
        items.add(new Item("Indomie Goreng Spesial", R.drawable.item9, "Indomie Goreng Spesial adalah mie instan goreng dengan bumbu spesial yang lezat. Dibuat dengan bahan-bahan pilihan, setiap suapan memberikan kenikmatan yang tak terlupakan. Rasakan kelezatannya dengan harga terjangkau.", "Rp 3.000"));
        items.add(new Item("Indomie Goreng Aceh", R.drawable.item10, "Indomie Goreng Aceh adalah mie instan goreng dengan cita rasa pedas khas Aceh. Dibumbui dengan bumbu khas, setiap suapan memberikan sensasi pedas yang menggigit. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 3.500"));
        items.add(new Item("Indomie Goreng Rendang", R.drawable.item11, "Indomie Goreng Rendang adalah mie instan goreng dengan cita rasa rendang yang khas. Dibuat dengan bumbu pilihan, setiap suapan membawa Anda merasakan kelezatan masakan Padang. Rasakan kelezatannya dengan harga terjangkau.", "Rp 3.000"));
        items.add(new Item("Indomie Seblak Hot Jeletot", R.drawable.item12, "Indomie Seblak Hot Jeletot adalah mie instan dengan kuah seblak yang pedas dan menggugah selera. Dibuat dengan bumbu khas, setiap suapan memberikan sensasi pedas yang menggigit. Nikmati sensasi lezatnya dengan harga terjangkau.", "Rp 4.000"));
        items.add(new Item("Sarimi Ayam Bawang", R.drawable.item13, "Deskripsi Sarimi Ayam BawangSarimi Ayam Bawang adalah mie instan dengan rasa ayam bawang yang lezat. Dibumbui dengan rempah pilihan, setiap suapan membawa Anda merasakan kelezatan masakan Indonesia. Rasakan kenikmatannya dengan harga terjangkau.", "Rp 5.500"));
        items.add(new Item("Sarimi Ayam Bawang adalah mie instan dengan rasa ayam bawang yang lezat. Dibumbui dengan rempah pilihan, setiap suapan membawa Anda merasakan kelezatan masakan Indonesia. Rasakan kenikmatannya dengan harga terjangkau.", R.drawable.item14, "Deskripsi Sarimi Goreng Rasa Ayam Kecap", "Rp 5.000"));
        items.add(new Item("Pop Mie Goreng Spesial", R.drawable.item15, "Pop Mie Goreng Spesial adalah mie instan goreng dengan bumbu spesial yang lezat. Dibuat dengan bahan-bahan pilihan, setiap suapan memberikan kenikmatan yang tak terlupakan. Rasakan kelezatannya dengan harga terjangkau.", "Rp 10.000"));
    }


}
