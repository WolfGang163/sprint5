public class Practicum {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task washFloor = new Task("пойти на работу", "без опозданий");
        Task washFloorCreated = taskManager.addTask(washFloor);
        System.out.println(washFloorCreated);

        Task washFloorToUpdate = new Task(washFloor.getId(), "не забыть пойти на работу", "можно и с опозданием",
                Status.IN_PROGRESS);
        Task washFloorUpdated = taskManager.updateTask(washFloorToUpdate);
        System.out.println(washFloorUpdated);


        Epic flatRenovation = new Epic("приготовить обед", "успеть за час");
        taskManager.addEpic(flatRenovation);
        System.out.println(flatRenovation);
        Subtask flatRenovationSubtask1 = new Subtask("пожарить мясо", "только говядину",
                flatRenovation.getId());
        Subtask flatRenovationSubtask2 = new Subtask("порезать лук", "сдержаться и не заплакать",
                flatRenovation.getId());
        taskManager.addSubtask(flatRenovationSubtask1);
        taskManager.addSubtask(flatRenovationSubtask2);
        System.out.println(flatRenovation);
        flatRenovationSubtask2.setStatus(Status.DONE);
        taskManager.updateSubtask(flatRenovationSubtask2);
        System.out.println(flatRenovation);
    }
}
