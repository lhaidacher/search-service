package at.fhj.swd.searchservice.service.impl.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@FeignClient(value = "inventory-service", url = "${at.fhj.swd.inventory-service}")
interface InventoryClient {
    @GetMapping(value = "/articles")
    Set<InventoryArticle> articles(@RequestParam String keyword);
}
