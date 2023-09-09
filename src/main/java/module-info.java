module sample.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.tts.todolist to javafx.fxml;
    exports dev.tts.todolist;
}