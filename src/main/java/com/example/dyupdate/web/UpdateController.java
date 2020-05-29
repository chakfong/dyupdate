package com.example.dyupdate.web;

import com.example.dyupdate.dto.response.ForceUpdateGetResp;
import com.example.dyupdate.dto.response.Result;
import com.example.dyupdate.dto.response.ResultBuilder;
import com.example.dyupdate.entity.Update;
import com.example.dyupdate.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.example.dyupdate.utils.CheckUtils.notNull;

@RestController
@RequestMapping("/csmpk")
public class UpdateController {

    @Autowired
    UpdateService updateService;

    @GetMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/force_update/get")
    public Result<ForceUpdateGetResp> getForceUpdate(@RequestParam("game_id") Integer gameId, @RequestParam("platform") Integer platform, @RequestParam("id") String channelId) {

        notNull(gameId, "arg.null", "游戏ID");
        notNull(platform, "arg.null", "平台号");
        notNull(channelId, "arg.null", "渠道号");

        Update updateDetail = updateService.getUpdateDetail(gameId, platform, channelId);

        Integer forceUpdateVersion = updateDetail.getForceUpdateVersion();
        Integer fullUpdate = updateDetail.getFullUpdate();
        String url = updateDetail.getUrl();
        return ResultBuilder.onSuc(new ForceUpdateGetResp(forceUpdateVersion, fullUpdate, url));
    }

}
