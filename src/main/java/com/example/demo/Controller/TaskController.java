package com.example.demo.Controller;

import com.example.demo.Entity.TaskRequest;
import com.example.demo.Service.TaskService;
import com.example.demo.Service.TaskServiceImpl;
import com.example.demo.Service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("listTasks", taskService.getAllTasks());
        return "index";
    }

    @GetMapping("/showTaskForm")
    public String showTask(Model model){
        TaskRequest taskRequest = new TaskRequest();
        model.addAttribute("task", taskRequest);
        return "add_task";
    }

    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("task") TaskRequest taskRequest){
        taskService.saveTask(taskRequest);
        return "redirect:/";
    }

    @GetMapping("/showUpdate/{id}")
    public String showUpdate(@PathVariable(value = "id") long id, Model model){
        TaskRequest taskRequest = taskService.getTaskId(id);
        model.addAttribute("task", taskRequest);
        return "update_task";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable(value = "id") long id){
        this.taskService.deleteTaskById(id);
        return "redirect:/";
    }

}
