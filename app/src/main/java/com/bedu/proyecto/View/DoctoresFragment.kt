package com.bedu.proyecto.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bedu.proyecto.R
import com.bedu.proyecto.Retrofit.DoctorInfo
import kotlinx.android.synthetic.main.doctor_fragment.view.*

class DoctoresFragment(var lista: List<DoctorInfo>): RecyclerView.Adapter<DoctoresFragment.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.doctor_fragment, parent, false)
        return MyViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var doctor = lista.get(position)
        holder.enlazarItem(doctor)
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun enlazarItem(doctor: DoctorInfo) {
            itemView.doctorName.text = "${doctor.nombre} ${doctor.apellidos}"
            itemView.doctorSpecial.text = doctor.clinica
            itemView.ratingBar.text = doctor.calificacion
        }

    }
}