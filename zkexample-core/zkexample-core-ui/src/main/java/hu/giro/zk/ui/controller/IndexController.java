package hu.giro.zk.ui.controller;

import hu.giro.zk.ui.viewmodel.IndexViewModel;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/index/*")
@Getter
@SessionAttributes(value = "indexVM")
public class IndexController {

//    private final IndexViewModel viewModel = new IndexViewModel();

//    @RequestMapping(value = {""}, method = RequestMethod.GET)
//    public String index(ModelMap model) {
//        model.addAttribute("indexVM",new IndexViewModel());
//        return "index.zul";
//    }
//
//    @RequestMapping(value = "/helloWorld")
//    @ZKCommandLifecycle
//    public @ZKNotifyChange("count") String helloWorld(@ZKVariable IndexViewModel vm){
//        vm.setCount(vm.getCount()+1);
//        return ZKModelAndView.SELF;
//    }

    @RequestMapping("/")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute(new IndexViewModel());
        return "index";
    }
}
