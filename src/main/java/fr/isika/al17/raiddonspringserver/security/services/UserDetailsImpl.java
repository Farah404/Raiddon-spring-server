package fr.isika.al17.raiddonspringserver.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.isika.al17.raiddonspringserver.models.PlayableCharacter;
import fr.isika.al17.raiddonspringserver.models.User;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;

  private String username;

  private String email;

  @JsonIgnore
  private String password;
  
  private String battleTag;

  private String profilePicture;
  
  private PlayableCharacter playableCharacter;

  private Collection<? extends GrantedAuthority> authorities;





public UserDetailsImpl(Long id, String username, String email, String password, String battleTag, String profilePicture,
	PlayableCharacter playableCharacter, Collection<? extends GrantedAuthority> authorities) {
    super();
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.battleTag = battleTag;
    this.profilePicture = profilePicture;
    this.playableCharacter = playableCharacter;
    this.authorities = authorities;
}

public static UserDetailsImpl build(User user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getId(), 
        user.getUsername(), 
        user.getEmail(),
        user.getPassword(),
        user.getBattleTag(),
        user.getProfilePicture(),
        user.getPlayableCharacter(),
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getBattleTag() {
    return battleTag;
}

public void setBattleTag(String battleTag) {
    this.battleTag = battleTag;
}

public String getProfilePicture() {
    return profilePicture;
}

public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
}


public static long getSerialversionuid() {
    return serialVersionUID;
}

public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
    this.authorities = authorities;
}

@Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
  

  public PlayableCharacter getPlayableCharacter() {
    return playableCharacter;
}

public void setPlayableCharacter(PlayableCharacter playableCharacter) {
    this.playableCharacter = playableCharacter;
}

@Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
