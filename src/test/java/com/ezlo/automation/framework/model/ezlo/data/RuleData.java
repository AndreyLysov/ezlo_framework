package com.ezlo.automation.framework.model.ezlo.data;

import com.ezlo.automation.framework.model.ezlo.inner.ThenData;
import com.ezlo.automation.framework.model.ezlo.inner.WhenData;
import com.google.gson.annotations.Expose;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.List;
import java.util.Objects;

@Entity(value = "rules", noClassnameStored = true)
public class RuleData {

    @Id
    @Expose
    @Property("_id")
    private ObjectId id;
    @Expose
    private Boolean enabled;
    @Expose
    @Property("group_id")
    private String groupId;
    @Expose
    @Property("is_group")
    private Boolean isGroup;
    @Expose
    private String name;
    @Expose
    @Property("parent_id")
    private String parentId;
    @Expose
    @Embedded
    @Property("then")
    private List<ThenData> thens;
    @Expose
    @Embedded
    @Property("when")
    private List<WhenData> whens;

    public RuleData withId(ObjectId id) {
        this.id = id;
        return this;
    }

    public RuleData withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public RuleData withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public RuleData withGroup(Boolean group) {
        isGroup = group;
        return this;
    }

    public RuleData withName(String name) {
        this.name = name;
        return this;
    }

    public RuleData withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public RuleData withThens(List<ThenData> thens) {
        this.thens = thens;
        return this;
    }

    public RuleData withWhens(List<WhenData> whens) {
        this.whens = whens;
        return this;
    }

    public ObjectId getId() {
        return id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getGroupId() {
        return groupId;
    }

    public Boolean getGroup() {
        return isGroup;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public List<ThenData> getThens() {
        return thens;
    }

    public List<WhenData> getWhens() {
        return whens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RuleData)) return false;
        RuleData ruleData = (RuleData) o;
        return Objects.equals(id, ruleData.id) &&
                Objects.equals(enabled, ruleData.enabled) &&
                Objects.equals(groupId, ruleData.groupId) &&
                Objects.equals(isGroup, ruleData.isGroup) &&
                Objects.equals(name, ruleData.name) &&
                Objects.equals(parentId, ruleData.parentId) &&
                Objects.equals(thens, ruleData.thens) &&
                Objects.equals(whens, ruleData.whens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enabled, groupId, isGroup, name, parentId, thens, whens);
    }

    @Override
    public String toString() {
        return "RuleData{" +
                "id=" + id +
                ", enabled=" + enabled +
                ", groupId='" + groupId + '\'' +
                ", isGroup=" + isGroup +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", thens=" + thens +
                ", whens=" + whens +
                '}';
    }
}
