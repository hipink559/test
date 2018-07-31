package com.internousdev.kagiya.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.kagiya.dto.DestinationInfoDTO;
import com.internousdev.kagiya.dto.UserInfoDTO;
public class UserInfoDTOTest {

// get Id test
	@Test
	public void testGetId1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetId5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Id test
	@Test
	public void testSetId1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetId5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get User_id test
	@Test
	public void testGetUser_id1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}


	// set User_id test
	@Test
	public void testSetUser_id1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUser_id12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	// get Password test
	@Test
	public void testGetPassword1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}


	// get Family_name test
	@Test
	public void testGetFamily_name1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected=" ";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="　";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}


	// set Family_name test
	@Test
	public void testSetFamily_name1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected=" ";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="　";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamily_name(expected);
		String actual = dto.getFamily_name();
		assertEquals(expected, actual);
	}


	// get First_name test
	@Test
	public void testGetFirst_name1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}



	// set First_name test
	@Test
	public void testSetFirst_name1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirst_name(expected);
		String actual = dto.getFirst_name();
		assertEquals(expected, actual);
	}



	// get Family_name_kana test
	@Test
	public void testGetFamily_name_kana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected=" ";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="　";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="あいう１２３";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamily_name_kana12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetFamily_name_kana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected=" ";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="　";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="あいう１２３";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamily_name_kana12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamily_name_kana(expected);
		String actual = dto.getFamily_name_kana();
		assertEquals(expected, actual);
	}


	// get First_name_kana test
	@Test
	public void testGetFirst_name_kana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirst_name_kana12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}



	// set First_name_kana test
	@Test
	public void testSetFirst_name_kana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="0";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="2147483647";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="-2147483647";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="null";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected="";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirst_name_kana12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirst_name_kana(expected);
		String actual = dto.getFirst_name_kana();
		assertEquals(expected, actual);
	}

	// get Status test
	// get User_id test
	@Test
	public void testGetStatus1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetStatus2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetStatus3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -9999999;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetStatus4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testGetStatus5() {
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set User_id test
	@Test
	public void testSetStatus1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetStatus2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetStatus3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -9999999;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetStatus4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testSetStatus5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get Sex test
	@Test
	public void testGetSex1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetSex5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Sex test
	@Test
	public void testSetSex1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSex2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetSex3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSex4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetSex5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	@Test
	public void testGetEmail1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// set Email test
	@Test
	public void testSetEmail1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail9() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail10() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail11() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail12() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// get Logined test
	@Test
	public void testGetLogined1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetLogined5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Logined test
	@Test
	public void testSetLogined1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLogined2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetLogined3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLogined4() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =10000000;
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetLogined5() throws Exception{
		UserInfoDTO dto =new UserInfoDTO();
		try{
			int postalMax =-10000000;
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// get Regist_date test
	@Test
	public void testGetRegist_date1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegist_date2() throws ParseException {
		DestinationInfoDTO dto = new DestinationInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//set Regist_date test
	@Test
	public void testSetRegist_date1() {
		UserInfoDTO dto = new UserInfoDTO();
		Date expected = null;

		dto.setRegist_date(expected);
		Date actual = dto.getRegist_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegist_date2() throws ParseException {
		UserInfoDTO dto = new UserInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}


	// get Update_date test
	@Test
	public void testGetUpdate_date1() {
		UserInfoDTO dto = new UserInfoDTO();
		Date expected = null;

		dto.setUpdate_date(expected);
		Date actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date2() throws ParseException{
		UserInfoDTO dto = new UserInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}

	@Test
	public void testSetUpdate_date1() {
		UserInfoDTO dto = new UserInfoDTO();
		Date expected = null;

		dto.setUpdate_date(expected);
		Date actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date2() throws ParseException{
		UserInfoDTO dto = new UserInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}

}