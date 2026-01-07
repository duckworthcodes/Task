@GetMapping("/dashboard")
public String dashboard(Model model) {
    model.addAttribute("tasks", taskService.getAllTasks());
    return "dashboard";
}
