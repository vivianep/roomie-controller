import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.roomie.Meeting;
import com.roomie.User;
import com.roomiecontroller.dao.MeetingDao;

public class TestMeetingDAO {

	public TestMeetingDAO(){
		meetingDAO = new MeetingDao();
	}
	
	
	MeetingDao meetingDAO;
	@Test
	public void testGetMeetingById() throws ClassNotFoundException, SQLException{
		
		int lastId = meetingDAO.getLastId();
		System.out.println(lastId);
		Meeting m = meetingDAO.getMeetingById(lastId);
		System.out.println(m.getName());
		assertTrue(m.getEndTime()!=null);
		assertNotNull(m.getEndTime());
		assertNotNull(m.getStartTime());
		assertNotNull(m.getName());
		assertNotNull(m.getRoomLocation());
		ArrayList<User> users = (ArrayList<User>) m.getUsers();
		assertNotNull(users.get(0).getEmail());
		assertNotNull(users.get(0).getId());
		assertNotNull(users.get(0).getRfidCode());
		assertNotNull(users.get(0).getUserName());
		
		
		
		
		
	}
}
