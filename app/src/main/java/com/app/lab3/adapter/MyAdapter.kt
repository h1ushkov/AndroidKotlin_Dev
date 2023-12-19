package com.app.lab3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.app.lab3.databinding.PartsItemBinding
import com.app.lab3.model.Parts

class MyAdapter(private val myList: LiveData<List<Parts>>) :
    RecyclerView.Adapter<MyAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyHolder {
        return PartsHolder(
            PartsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyAdapter.MyHolder, position: Int) {
        return holder.bind(myList.value!![position])
    }

    override fun getItemCount(): Int {
        return myList.value!!.size
    }

    abstract class MyHolder(itemBinding: ViewBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        abstract fun bind(item: Parts)
    }

    class PartsHolder(private val itemBinding: PartsItemBinding) : MyHolder(itemBinding) {
        override fun bind(item: Parts) {
            itemBinding.partName.text = item.partName
            itemBinding.partVIN.text = item.partVIN
            itemBinding.partPrice.text = item.partPrice
            itemBinding.partYear.text = item.partYear
            itemBinding.partMark.text = item.partMark
        }

    }
}
