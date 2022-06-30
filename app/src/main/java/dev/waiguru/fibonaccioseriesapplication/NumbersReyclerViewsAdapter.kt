package dev.waiguru.fibonaccioseriesapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class NumbersReyclerViewsAdapter(var numberList: List<Int>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder{
        var  itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_views, parent,false)
        return  NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvName.text = numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}

class NumbersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName =itemView.findViewById<TextView>(R.id.tvName)

}