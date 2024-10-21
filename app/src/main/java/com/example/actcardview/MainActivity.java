package com.example.actcardview;

// Importamos las clases necesarias para la actividad, el RecyclerView y la gestión de listas.
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// Clase principal de la actividad que extiende AppCompatActivity.
public class MainActivity extends AppCompatActivity {
    private List<ListadoDeElementos> institucionList; // Lista que almacenará los elementos de las instituciones.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Método que se llama al crear la actividad.
        super.onCreate(savedInstanceState);
        // Establecemos el layout de la actividad.
        setContentView(R.layout.activity_main);

        // Inicializar la lista de instituciones.
        institucionList = new ArrayList<>();
        // Agregamos instancias de ListadoDeElementos a la lista con la información de cada institución.
        institucionList.add(new ListadoDeElementos(
                "Universidad de la serena",
                "La Serena",
                "La Universidad de La Serena es una de las 16 universidades tradicionales de Chile, perteneciente al Consejo de Rectores de las Universidades Chilenas",
                R.drawable.logo_uls_8,
                "Avenida Raúl Bitrán Nachary",
                "123456789",
                "http://www.Usn.com"
        ));

        institucionList.add(new ListadoDeElementos(
                "Universidad Catolica Del Norte",
                "Coquimbo",
                "La Universidad Católica del Norte (UCN) es una institución de educación superior chilena privada, perteneciente a la Iglesia católica.",
                R.drawable.logoucn,
                "Larrondo 1281, Coquimbo",
                "987654321",
                "http://www.Ucn.com"
        ));

        institucionList.add(new ListadoDeElementos(
                "Santo Tomas",
                "La Serena",
                "La Universidad Santo Tomás, comúnmente llamada por sus siglas UST, es una universidad privada chilena fundada en 1988.",
                R.drawable.santotomas,
                "Ruta 5",
                "987654321",
                "http://www.St.com"
        ));

        institucionList.add(new ListadoDeElementos(
                "IpChile",
                "La Serena",
                "IPCHILE es una institución acreditada que ofrece carreras técnicas y profesionales, cursos y diplomados en modalidades presencial.",
                R.drawable.logoipchile,
                "Avenida Francisco de Aguirre 388 1710128 La Serena Coquimbo",
                "987654321",
                "http://www.IpChile.com"
        ));

        institucionList.add(new ListadoDeElementos(
                "Inacap",
                "La Serena",
                "INACAP ofrece carreras técnicas, profesionales y de educación continua en diversas áreas y modalidades.",
                R.drawable.logo_inacap,
                "Av. Francisco De Aguirre #0389 1700000 La Serena Coquimbo.",
                "987654321",
                "http://www.Inacap.com"
        ));

        // Configuramos el RecyclerView para mostrar la lista de instituciones.
        RecyclerView recyclerView = findViewById(R.id.listRecycledView); // Buscamos el RecyclerView en el layout.
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Establecemos un LinearLayoutManager para la lista.

        // Creamos una instancia del adaptador y le pasamos la lista de instituciones.
        ListAdapter adapter = new ListAdapter(institucionList, this);
        recyclerView.setAdapter(adapter); // Asignamos el adaptador al RecyclerView.
    }
}