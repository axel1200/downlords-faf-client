package com.faforever.client.clan;

import com.google.api.client.util.Key;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
public class Clan {

  @Key("clan_desc")
  private String description;
  @Key("clan_founder_id")
  private Integer clanFounderId;
  @Key("clan_id")
  private String id;
  @Key("clan_leader_id")
  private Integer clanLeader;
  @Key("clan_members")
  private Integer clanMembers;
  @Key("clan_name")
  private String clanName;
  @Key("clan_tag")
  private String clanTag;
  @Key("create_date")
  private String createTime;
  @Key("founder_name")
  private String founderName;
  @Key("leader_name")
  private String leaderName;
  @Key
  private Integer status;
}
