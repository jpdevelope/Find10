package com.pct_dez.find10;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Adonai Móveis & Eletros", "Afins Cosméticos", "Clube da Ortodontia - Dr. Gutemberg",
            "Comercial Vieira - Org. Sr. Vieira & filhos", "Farmácia dos Remédios Popular", "Kim Climatização",
            "Papelaria & Livraria Mais Cultura", "Pastelaria Caldo de Cana", "W & E Imóveis - Soluções Imbiliárias",
            "3R Informática - Suporte Técnico Especializado", "Casa da Merenda - Sr. Dedé & Família", "Castro - Costurando Ideias"};
    String mDescription[] = {"Av. Lúcio José de Menezes, 1340 - Croatá I - Pacajus-Ce.",
            "Rua Luiz Cláudio, 196A - Centro - Pacajus-Ce.",
            "Rua Poeta Pedro Cesário, 360, altos, sala 01, Centro - Pacajus-Ce.",
            "Rua Alipio Oliveira Lima, 90 (Mercado dos Cereais - Box 39) - Centro - Pacajus-Ce.",
            "Rua Engenheiro João Bosco, 218, Centro. Entregamos em domicílio: 3348-0900 / 99202-3536",
            "Rua Antônio Germano de Sousa, 575, Buriti - Pacajus-Ce.",
            "Rua Cônego Eduardo Araripe, 1646 - Centro - Pacajus-Ce.",
            "Av. Lúcio José de Menezes, 1336 - Croatá I, Pacajus-Ce.",
            "Rua Naíde Costa de Menezes, 59, Centro - Pacajus-Ce.",
            "Av. Lúcio José de Menezes, 1001, Croatá I - Pacajus-Ce.",
            "Rua Poeta Pedro Cesário, 361, Centro - Pacajus-Ce.",
            "Org. Ivanir Castro - (85) 9 9178-2548"};
    int images[] = {R.drawable.adonailogo, R.drawable.afins_logo, R.drawable.clube_orto_logomarca, R.drawable.comercial_vieira_logo,
            R.drawable.farmacia_popular_logomarca,R.drawable.kim_logomarca,R.drawable.mais_cultura_logo,R.drawable.pastelaria_logomarca,
    R.drawable.we_logomarca,R.drawable.roney,R.drawable.casa_merenda_logo,R.drawable.ivanirlogo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Adonai Móveis & Eletros", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(MainActivity.this,"Afins Cosméticos", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(MainActivity.this, "Clube da Ortodontia - Dr. Gutemberg", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(MainActivity.this, "Comercial Vieira - Org. Sr. Vieira & filhos", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(MainActivity.this, "Farmácia dos Remédios Popular", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Toast.makeText(MainActivity.this, "Kim Climatização", Toast.LENGTH_SHORT).show();
                }
                if (position == 6) {
                    Toast.makeText(MainActivity.this, "Papelaria & Livraria Mais Cultura", Toast.LENGTH_SHORT).show();
                }
                if (position == 7) {
                    Toast.makeText(MainActivity.this, "Pastelaria Caldo de Cana", Toast.LENGTH_SHORT).show();
                }
                if (position == 8) {
                    Toast.makeText(MainActivity.this, "W & E Imóveis - Soluções Imobiliárias", Toast.LENGTH_SHORT).show();
                }
                if (position == 9) {
                    Toast.makeText(MainActivity.this, "3R Informática - Suporte Técnico Especializado", Toast.LENGTH_SHORT).show();
                }
                if (position == 10) {
                    Toast.makeText(MainActivity.this, "Casa da Merenda - Sr. Dedé & Família do pão de queio", Toast.LENGTH_SHORT).show();
                }
                if (position == 11) {
                    Toast.makeText(MainActivity.this, "Castro - Costurando Ideias", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String[] title, String[] description, int[] imgs) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }

}
