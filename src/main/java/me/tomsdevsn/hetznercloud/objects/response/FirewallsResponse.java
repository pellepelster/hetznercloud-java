package me.tomsdevsn.hetznercloud.objects.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tomsdevsn.hetznercloud.objects.general.Firewall;
import me.tomsdevsn.hetznercloud.objects.general.Meta;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirewallsResponse {

    private List<Firewall> firewalls;
    private Meta meta;

}
