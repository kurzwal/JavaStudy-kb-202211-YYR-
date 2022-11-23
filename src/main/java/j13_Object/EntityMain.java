package j13_Object;

public class EntityMain {
	public static void main(String[] args) {
		
		Entity entity = new Entity("유열림", 29, "부산 사상구 사상로");
		Entity entity2 = new Entity("유열림", 29, "부산 사상구 사상로");
		
		System.out.println(entity);
		System.out.println(entity.equals(entity2));
		System.out.println(entity.hashCode());
		System.out.println(entity2.hashCode());
		System.out.println(entity.getAddress());
		
		System.out.println(entity.getClass());
		System.out.println(Entity.class);
		
	}
}
