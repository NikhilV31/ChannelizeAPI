package com.channelize.apisdk.network.response;


import com.google.gson.annotations.SerializedName;
import com.channelize.apisdk.model.Member;

import java.util.List;


public class ListMemberResponse implements GenericResponse {

    @SerializedName("response")
    private List<Member> response;

    public List<Member> getMembers() {
        return response;
    }

    public void setMembers(List<Member> members) {
        this.response = members;
    }

}
