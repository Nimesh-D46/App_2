package com.example.app_2

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ActivityFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_activities_pg, container, false)

        val replyButton: Button = view.findViewById(R.id.replyBtn)
        replyButton.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Reply")
            val input = android.widget.EditText(requireContext())
            input.hint = "Type your reply here"
            builder.setView(input)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            builder.show()
        }

        return view
    }
}
