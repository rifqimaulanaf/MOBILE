package com.example.profilfakultasupnjatim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.detailfakultas.view.*
import kotlinx.android.synthetic.main.detailfakultas.view.namafakultas
import kotlinx.android.synthetic.main.rvlistfakultas.view.*

class adapter(
    private val fakultasItemList: List<fakultaslistview>,
    private val clickListener: (fakultaslistview) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rvlistfakultas, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as PartViewHolder).bind(fakultasItemList[position], clickListener)

    override fun getItemCount() = fakultasItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(fakultaslistview: fakultaslistview, clickListener: (fakultaslistview) -> Unit) {
            itemView.nama.text = fakultaslistview.namafakultaslist
            itemView.imageView.setBackgroundResource(fakultaslistview.image)
            itemView.imageView.contentDescription = fakultaslistview.namafakultaslist
            itemView.setOnClickListener { clickListener(fakultaslistview) }
        }
    }
}
