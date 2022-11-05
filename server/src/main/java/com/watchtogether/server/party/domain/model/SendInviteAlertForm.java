package com.watchtogether.server.party.domain.model;

import com.watchtogether.server.party.domain.entitiy.Party;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendInviteAlertForm {

    private String nickName;

    private String uuid;

    private Party party;
}
