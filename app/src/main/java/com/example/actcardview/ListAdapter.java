package com.example.actcardview;

// Importamos clases necesarias para el manejo de la interfaz de usuario y el RecyclerView.
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Clase principal que extiende RecyclerView.Adapter para gestionar una lista de elementos.
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListadoDeElementos> mData; // Lista de elementos que se mostrará en el RecyclerView.
    private LayoutInflater mInflater; // Inflador para crear vistas a partir de XML.

    // Constructor que recibe la lista de elementos y el contexto.
    public ListAdapter(List<ListadoDeElementos> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context); // Inicializamos el inflador.
        this.mData = itemList; // Asignamos la lista de datos.
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflamos el layout para cada elemento de la lista.
        View view = mInflater.inflate(R.layout.listado, parent, false);
        return new ViewHolder(view); // Retornamos un nuevo ViewHolder.
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Obtenemos el elemento de la lista en la posición actual.
        ListadoDeElementos item = mData.get(position);
        holder.bindData(item); // Llenamos el ViewHolder con los datos del elemento.

        // Establecemos un listener para el botón "Más detalles".
        holder.btnMoreDetails.setOnClickListener(v -> {
            // Creamos un Intent para navegar a la actividad de detalles.
            Intent intent = new Intent(v.getContext(), ActivityDetalles.class);
            // Pasamos los datos del elemento seleccionado a la nueva actividad.
            intent.putExtra("nombre", item.getNombre());
            intent.putExtra("ciudad", item.getCiudad());
            intent.putExtra("descripcion", item.getDescripcion());
            intent.putExtra("direccion", item.getDireccion());
            intent.putExtra("telefono", item.getTelefono());
            intent.putExtra("sitioWeb", item.getSitioWeb());
            // Iniciamos la nueva actividad.
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mData.size(); // Retornamos el número de elementos en la lista.
    }

    // Clase interna ViewHolder que mantiene la referencia a las vistas de cada elemento.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvDescripcion; // Elementos de texto para nombre y descripción.
        ImageView ivLogo; // Imagen para el logo.
        Button btnMoreDetails; // Botón para ver más detalles.

        // Constructor del ViewHolder que recibe la vista del elemento.
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializamos los elementos usando findViewById.
            tvNombre = itemView.findViewById(R.id.tvNombreUdelaSerena); // Cambiar ID según el layout.
            tvDescripcion = itemView.findViewById(R.id.tvDescripcionUdelaSerena); // Cambiar ID según el layout.
            ivLogo = itemView.findViewById(R.id.ivLogoUdelaSerena); // Cambiar ID según el layout.
            btnMoreDetails = itemView.findViewById(R.id.btnMoreDetailsUdelaSerena); // Cambiar ID según el layout.
        }

        // Método para llenar los elementos del ViewHolder con datos.
        void bindData(ListadoDeElementos item) {
            tvNombre.setText(item.getNombre()); // Asignamos el nombre.
            tvDescripcion.setText(item.getDescripcion()); // Asignamos la descripción.
            ivLogo.setImageResource(item.getImageResId()); // Asignamos la imagen del logo.
        }
    }
}