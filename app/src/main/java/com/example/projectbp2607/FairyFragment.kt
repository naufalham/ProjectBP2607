package com.example.projectbp2607

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FairyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FairyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fairy, container, false)


        val rvBuku: RecyclerView = view.findViewById(R.id.recyclerViewFairy)

        rvBuku.layoutManager = LinearLayoutManager(requireContext())
        //list data buku
        val data = ArrayList<FableModel>()
        data.add(FableModel(R.drawable.kelelawar, "Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(FableModel(R.drawable.kucing, "Ade's Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(FableModel(R.drawable.sapi, "Mermaid To Rescue",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(FableModel(R.drawable.ayam, "Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(FableModel(R.drawable.beruang, "Ade's Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(FableModel(R.drawable.jerapah, "Mermaid To Rescue",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        //set adapter
        val adapter = AdapterFable(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FairyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FairyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}