package LinkedList;

public class DoubleLinkedList {

	private Element first;
	private Element last;
	private Element iterator;

	public Element insertFirst(int value) {
		if (first == null) {
			first = new Element(value, null, null);
			last = first;
		} else {
			Element newFirst = new Element(value, null, first);
			first.setPrevious(newFirst);
		    first = newFirst; 
			
		
		}
		return first;
	}

	public Element insertLast(int value) {
		if (last == null) {
			last = new Element(value, null, null);
			first = last;
		} else {
			Element newLast = new Element(value, last, null);
			last.setNext(newLast);
			last = newLast;
		}
		return last;
	}
	
	public void remove(Element toRemove) {
		Element previous = toRemove.getPrevious();
		Element next = toRemove.getNext();
		if (previous != null) {
			previous.setNext(next);
		}
		if (next != null) {
			next.setPrevious(previous);
		}
		if (toRemove.equals(first)) {
			first = next;
		}
		if (toRemove.equals(last)) {
			last = previous;
		}
	}
	
	public Element next() {
		if (iterator == null) {
			iterator = first;
			return iterator;
		}
		iterator = iterator.next;
		return iterator;
	}
	
	public void reset() {
		iterator = null;
	}

	public class Element {

		private final int value;
		private Element previous;
		private Element next;

		private Element(int value, Element previous, Element next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public Element getPrevious() {
			return previous;
		}

		public void setPrevious(Element previous) {
			this.previous = previous;
		}

		public Element getNext() {
			return next;
		}

		public void setNext(Element next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		Element fifthElement = list.insertFirst(5);
		Element fourthElement = list.insertFirst(4);
		Element thirdElement = list.insertFirst(3);
		Element secondElement = list.insertFirst(2);
		Element firstElement = list.insertFirst(1);
		
		Element sixthElement = list.insertLast(6);
		Element seventhElement = list.insertLast(7);
		Element eighthElement = list.insertLast(8);
		Element ninethElement = list.insertLast(9);
		
		Element element;
		while ((element = list.next()) != null) {
			System.out.println(element.getValue());
		}
		
		list.remove(fifthElement);
		System.out.println("REMOVE 5");
		list.reset();
		while ((element = list.next()) != null) {
			System.out.println(element.getValue());
		}
		
		list.remove(firstElement);
		System.out.println("REMOVE 1");
		list.reset();
		while ((element = list.next()) != null) {
			System.out.println(element.getValue());
		}
		
		list.remove(ninethElement);
		System.out.println("REMOVE 9");
		list.reset();
		while ((element = list.next()) != null) {
			System.out.println(element.getValue());
		}
		
		list.remove(secondElement);		
		list.remove(thirdElement);
		list.remove(fourthElement);
		list.remove(sixthElement);
		list.remove(seventhElement);
		list.remove(eighthElement);
		System.out.println("REMOVE ALL");
		list.reset();
		while ((element = list.next()) != null) {
			System.out.println(element.getValue());
		}
	}
}
