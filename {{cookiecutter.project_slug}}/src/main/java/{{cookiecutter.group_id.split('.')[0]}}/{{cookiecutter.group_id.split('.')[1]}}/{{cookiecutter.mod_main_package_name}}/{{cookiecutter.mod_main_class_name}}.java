package {{cookiecutter.group_id}}.{{cookiecutter.modid}};

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import {{cookiecutter.group_id}}.{{cookiecutter.modid}}.proxy.CommonProxy;


@Mod(
    modid = {{cookiecutter.mod_main_class_name}}.MODID,
    name = {{cookiecutter.mod_main_class_name}}.NAME,
    version = {{cookiecutter.mod_main_class_name}}.VERSION
)
public class {{cookiecutter.mod_main_class_name}} {
    public static final  String MODID = "{{cookiecutter.modid}}";
    public static final String NAME = "{{cookiecutter.project_name}}";
    public static final String VERSION = "@version@";
    public static Logger logger = LogManager.getLogger(MODID);
    @Mod.Instance(MODID)
    public static {{cookiecutter.mod_main_class_name}} instance;

    @SidedProxy(
        clientSide = "{{cookiecutter.group_id}}.{{cookiecutter.modid}}.proxy.ClientProxy",
        serverSide = "{{cookiecutter.group_id}}.{{cookiecutter.modid}}.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
