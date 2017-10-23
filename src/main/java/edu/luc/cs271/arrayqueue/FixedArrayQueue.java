package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?
  //we need an explicit contructor 

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // DONE
    if (size == capacity){
      reallocate();
    }
    size++;
    rear = (rear + 1) % capacity;
    data[rear] = item;
    return true;
  }

  @Override
  public E peek() {
    // DONE
    if (size == 0){
      return null
    }
    return data[Front];
  }

  @Override
  public E poll() {
    // DONE
    if (size == 0){
      return null;
    }
    E result = data[front];
    front = (front + 1) % capacity;
    size--;
    return result;
  }

  @Override
  public boolean isEmpty() {
    // Done
    if (rear != null){
      return false
    }
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    //  implement using an ArrayList preallocated with the right size
    final ArrayList<E> List = new ArrayList<>(capacity);
    while(rear != null){
      List.add(rear)
    }
    return Arrays.asList();
  }
}
