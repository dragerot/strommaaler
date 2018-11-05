package strommaaler.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import strommaaler.model.Maaling;
import strommaaler.service.MaalingService;



import java.util.List;

//// http://localhost:8022/create/1/1/2016/8
@RestController
@RequestMapping("/maalinger")
public class StrommaalerKontroller {
    @Autowired
    MaalingService maalingService;

    @GetMapping(value = "/ping")
    public String ping(){
        return this.getClass().getCanonicalName();
    }

    // http://localhost:8080/maalinger/test
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public Boolean create() {
        return true;
    }

    // http://localhost:8080/maalinger/list
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public List<Maaling> list(){
        return maalingService.list();
    }

   // http://localhost:8080/maalinger/create/20001/200/1000/2000
   @RequestMapping(value = "/create/{totalmaaling}/{utleiemaaling}/{aar}/{maaned}", method = RequestMethod.GET, produces = "application/json")
    public Maaling create(@PathVariable("totalmaaling") Integer totalmaaling,
                                @PathVariable("utleiemaaling") Integer utleiemaaling,
                                @PathVariable("aar") Integer aar,
                                @PathVariable("maaned") Integer maaned) {

        return maalingService.create(createMaaling(totalmaaling,utleiemaaling,aar,maaned));
    }

    private Maaling createMaaling(Integer totalmaaling,
                                  Integer utleiemaaling,
                                  Integer aar,
                                  Integer maaned){
        Maaling maaling = new Maaling();
        maaling.setAar(aar);
        //Instant instant = Instant.now();

        //maaling.setCreationDate();
        maaling.setGjelderMaaned(maaned);
        maaling.setMaalingHoved(totalmaaling);
        maaling.setMaalingLeietaker(utleiemaaling);
        return maaling;
    }
}
