package com.ezlo.automation.framework.tests.examples;

import com.ezlo.automation.framework.tests.BaseTest;

public class GroupCreationTests extends BaseTest {

//  @DataProvider
//  public Iterator<Object[]> validGroupsFromXml() throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/validGroups.xml")));
//    String xml = "";
//    String line = reader.readLine();
//    while (line != null){
//      xml += line;
//      line = reader.readLine();
//    }
//    XStream xstream = new XStream();
//    xstream.processAnnotations(GroupData.class);
//    List<GroupData> groups = (List<GroupData>) xstream.fromXML(xml);
//    return groups.stream().map((g) ->  new Object[] {g}).collect(Collectors.toList()).iterator();
//  }
//
//  @DataProvider
//  public Iterator<Object[]> validGroupsFromJson() throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/validGroups.json")));
//    String json = "";
//    String line = reader.readLine();
//    while (line != null){
//      json += line;
//      line = reader.readLine();
//    }
//    Gson gson = new Gson();
//    List<GroupData> groups = gson.fromJson(json, new TypeToken<List<GroupData>>(){}.getType());
//    return groups.stream().map((g) ->  new Object[] {g}).collect(Collectors.toList()).iterator();
//  }
//
//  @DataProvider
//  public Iterator<Object[]> inValidGroupsXml() throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/invalidGroups.xml")));
//    String xml = "";
//    String line = reader.readLine();
//    while (line != null){
//      xml += line;
//      line = reader.readLine();
//    }
//    XStream xstream = new XStream();
//    xstream.processAnnotations(GroupData.class);
//    List<GroupData> groups = (List<GroupData>) xstream.fromXML(xml);
//    return groups.stream().map((g) ->  new Object[] {g}).collect(Collectors.toList()).iterator();
//  }
//
//  @Test(dataProvider = "validGroupsFromJson")
//  public static void testGroupCreation(GroupData group) {
//    app.goTo().groupPage();
//    Groups before = app.group().all();
//    app.group().create(group);
//    assertThat(app.group().count(), equalTo(before.size() + 1));
//    Groups after = app.group().all();
//    //noinspection ConstantConditions
//    assertThat(after, equalTo(
//          before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt())
//                .withFooter(null)
//                .withHeader(null))));
//    verifyGroupListInUI();
//  }
//
//  @Test(enabled = true, dataProvider = "inValidGroupsXml")
//  public void testBadGroupCreation(GroupData group) {
//    app.goTo().groupPage();
//    Groups before = app.group().all();
//    app.group().create(group);
//    assertThat(app.group().count(), equalTo(before.size()));
//    Groups after = app.group().all();
//    assertThat(after, equalTo(before));
//    verifyGroupListInUI();
//  }

}
