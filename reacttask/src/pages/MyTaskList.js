import { useState, useEffect, useRef } from "react";

const defaultNewTask = {
  name: "",
  updatedText: "",
  isComplete: false,
  isEditing: false,
};

const MyTaskList = () => {
  const [areStoredItemsLoaded, setAreStoredItemsLoaded] = useState(false);
  const [newTask, setNewTask] = useState(defaultNewTask);
  const [storedTasks, setStoredTasks] = useState([]);

  // when the component first loads, then load the tasks from localStorage
  useEffect(() => {
    if (areStoredItemsLoaded) return;

    // load items from storage (once on initial page load)
    const initialTasks = localStorage.getItem("tasks")
      ? JSON.parse(localStorage.getItem("tasks"))
      : [];

    // set the items from storage
    setStoredTasks(initialTasks);
    setAreStoredItemsLoaded(true);
  }, []);

  // save tasks to localStorage when they are updated
  useEffect(() => {
    if (!areStoredItemsLoaded) return; // prevent storage clear before saved items are initialized in storedTasks

    localStorage.setItem("tasks", JSON.stringify(storedTasks));
  }, [storedTasks]);

  const addTask = () => {
    if (newTask.name.trim().length < 1) return;

    // update stored tasks in the component state
    setStoredTasks([...storedTasks, newTask]);

    // clear the new task from the input (start over)
    setNewTask(defaultNewTask);
  };

  const updateNewTask = (newTaskValue) => {
    console.log(newTaskValue);
    setNewTask({ ...newTask, name: newTaskValue });
  };

  const updateExistingTask = (index) => {
    setStoredTasks(
      storedTasks.map((item, i) =>
        i == index ? { ...item, name: item.updatedText, updatedText: "" } : item
      )
    );
  };

  const handleDelete = (index) => {
    setStoredTasks(storedTasks.filter((_, i) => index != i));
  };

  const handleComplete = (index) => {
    setStoredTasks(
      storedTasks.map((item, i) =>
        i == index ? { ...item, isComplete: !item.isComplete } : item
      )
    );
  };

  const handleTextUpdate = (index, updateValue) => {
    setStoredTasks(
      storedTasks.map((item, i) =>
        i == index ? { ...item, updatedText: updateValue } : item
      )
    );
  };

  return (
    <>
      <div className="newTask">
        <input
          type="text"
          id="new-task-name"
          value={newTask.name}
          onChange={(event) => updateNewTask(event.target.value)}
        />
        <button id="add-task" onClick={addTask}>
          Add Task
        </button>
      </div>
      <div className="taskList">
        <p>Tasks: {storedTasks.length}</p>
        {storedTasks.map((task, index) => {
          return (
            <div key={`task-${index}`}>
              {task.isComplete ? "Completed: " : ""}
              <input
                onChange={(event) =>
                  handleTextUpdate(index, event.target.value)
                }
                id={`update-text-${index}`}
                type="text"
                defaultValue={task.name}
              />
              <button
                id={`update-${index}`}
                onClick={(event) => updateExistingTask(index)}
              >
                Update
              </button>
              <button
                id={`complete-${index}`}
                onClick={() => handleComplete(index)}
              >
                {task.isComplete ? "Undo" : "Complete"}
              </button>
              <button
                id={`delete-${index}`}
                onClick={() => handleDelete(index)}
              >
                Delete
              </button>
            </div>
          );
        })}
      </div>
    </>
  );
};

export default MyTaskList;
