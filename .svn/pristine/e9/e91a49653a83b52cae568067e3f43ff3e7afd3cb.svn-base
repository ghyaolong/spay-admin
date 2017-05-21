package com.syhbuy.spay.admin.base.util;

import java.util.List;

/**
 * Created by Administrator on 2016/9/28.
 */
public class TreeNode {

    private String nodeId;
    private String roleId;
    private String resId;

    private String text;
    private List<TreeNode> nodes;
    private State state;

    class State{
        private boolean checked;

        public State(boolean checked) {
            this.checked = checked;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }
    }

    public TreeNode(String nodeId,String roleId,String resId, String text ,Boolean state) {
        this.nodeId = nodeId;
        this.roleId=roleId;
        this.resId=resId;
        this.text = text;
        this.state = new State(state);
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeNode> nodes) {
        this.nodes = nodes;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }
}
