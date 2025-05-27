package interfaces;
import java.lang.*;
import classes.Member;

public interface MemberOperations
{
	boolean insertMember(Member m);
	boolean removeMember(Member m);
	Member searchMember(int id);
	void showAllMembers();

}