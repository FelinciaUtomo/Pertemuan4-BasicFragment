package com.example.pertemuan4_basicfragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ToDoFragment extends Fragment {
    private ToDo mToDo;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mDoneCheckBox;

//  Generate - Getter and setter - pilih onCreate dan onCreateView
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mToDo = new ToDo();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_todo,container,false);
        mTitleField = v.findViewById(R.id.EditTextTodo);
        mTitleField.addTextChangedListener(new TextWatcher() {

//          Generate - Override Methods - pilih semua
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mToDo.setmTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mDateButton = (Button) v.findViewById(R.id.taskdate);
        mDateButton.setText(mToDo.getmDate().toString());
        mDateButton.setEnabled(false);

        mDoneCheckBox = (CheckBox) v.findViewById(R.id.cbdone);
        mDoneCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mToDo.setmDone(b);
            }
        });

        return v;
    }
}
