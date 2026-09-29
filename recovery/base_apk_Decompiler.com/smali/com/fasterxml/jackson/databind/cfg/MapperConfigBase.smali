###### Class com.fasterxml.jackson.databind.cfg.MapperConfigBase (com.fasterxml.jackson.databind.cfg.MapperConfigBase)
.class public abstract Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
.super Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CFG::",
        "Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;",
        "T:",
        "Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<",
        "TCFG;TT;>;>",
        "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final AUTO_DETECT_MASK:J

.field private static final DEFAULT_MAPPER_FEATURES:J

.field protected static final EMPTY_OVERRIDE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;


# instance fields
.field protected final _attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

.field protected final _configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

.field public final _datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

.field protected final _mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

.field public final _rootName:Lcom/fasterxml/jackson/databind/PropertyName;

.field protected final _rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

.field protected final _subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

.field protected final _view:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 9

    .line 32
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->empty()Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->EMPTY_OVERRIDE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    .line 34
    invoke-static {}, Lcom/fasterxml/jackson/databind/MapperFeature;->collectLongDefaults()J

    move-result-wide v0

    sput-wide v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->DEFAULT_MAPPER_FEATURES:J

    .line 39
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_FIELDS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 40
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v0

    sget-object v2, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_GETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 41
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v2

    sget-object v4, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_IS_GETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 42
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v4

    sget-object v6, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_SETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 43
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v6

    sget-object v8, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_CREATORS:Lcom/fasterxml/jackson/databind/MapperFeature;

    or-long/2addr v0, v2

    or-long/2addr v0, v4

    or-long/2addr v0, v6

    .line 44
    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v2

    or-long/2addr v0, v2

    sput-wide v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->AUTO_DETECT_MASK:J

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;Lcom/fasterxml/jackson/databind/util/RootNameLookup;Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;)V
    .registers 9

    .line 134
    sget-wide v0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->DEFAULT_MAPPER_FEATURES:J

    invoke-direct {p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;-><init>(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;J)V

    .line 135
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    .line 136
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    .line 137
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    const/4 p1, 0x0

    .line 138
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 139
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    .line 141
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;->getEmpty()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    .line 142
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    .line 143
    iput-object p6, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;J)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<",
            "TCFG;TT;>;J)V"
        }
    .end annotation

    .line 201
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;J)V

    .line 202
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    .line 203
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    .line 204
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    .line 205
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 206
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    .line 207
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    .line 208
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    .line 209
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<",
            "TCFG;TT;>;",
            "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;",
            ")V"
        }
    .end annotation

    .line 188
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V

    .line 189
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    .line 190
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    .line 191
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    .line 192
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 193
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    .line 194
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    .line 195
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    .line 196
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-void
.end method


# virtual methods
.method protected abstract _withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;",
            ")TT;"
        }
    .end annotation
.end method

.method protected abstract _withMapperFeatures(J)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation
.end method

.method public final findMixInClassFor(Ljava/lang/Class;)Ljava/lang/Class;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 904
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_mixIns:Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;->findMixInClassFor(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public findRootName(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 3

    .line 878
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    if-eqz v0, :cond_5

    return-object v0

    .line 881
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    invoke-virtual {v0, p1, p0}, Lcom/fasterxml/jackson/databind/util/RootNameLookup;->findRootName(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0
.end method

.method public findRootName(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/PropertyName;"
        }
    .end annotation

    .line 886
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    if-eqz v0, :cond_5

    return-object v0

    .line 889
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootNames:Lcom/fasterxml/jackson/databind/util/RootNameLookup;

    invoke-virtual {v0, p1, p0}, Lcom/fasterxml/jackson/databind/util/RootNameLookup;->findRootName(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0
.end method

.method public final getActiveView()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 708
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_view:Ljava/lang/Class;

    return-object p0
.end method

.method public final getAttributes()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;
    .registers 1

    .line 713
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_attributes:Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;

    return-object p0
.end method

.method public final getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;"
        }
    .end annotation

    .line 724
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->findOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p0

    if-nez p0, :cond_a

    .line 725
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->EMPTY_OVERRIDE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    :cond_a
    return-object p0
.end method

.method public final getDatatypeFeatures()Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;
    .registers 1

    .line 678
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_datatypeFeatures:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-object p0
.end method

.method public final getDefaultInclusion(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    .line 751
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p2

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getIncludeAsProperty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p2

    .line 752
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getDefaultPropertyInclusion(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    if-nez p0, :cond_f

    return-object p2

    .line 756
    :cond_f
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public getDefaultMergeable()Ljava/lang/Boolean;
    .registers 1

    .line 854
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->getDefaultMergeable()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public getDefaultMergeable(Ljava/lang/Class;)Ljava/lang/Boolean;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 860
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->findOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 862
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getMergeable()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_f

    return-object p1

    .line 867
    :cond_f
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->getDefaultMergeable()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultPropertyFormat(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;"
        }
    .end annotation

    .line 761
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->findFormatDefaults(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultPropertyIgnorals(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;"
        }
    .end annotation

    .line 766
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->findOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p0

    if-eqz p0, :cond_f

    .line 768
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getIgnorals()Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    if-eqz p0, :cond_f

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method public final getDefaultPropertyIgnorals(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;"
        }
    .end annotation

    .line 782
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 p2, 0x0

    goto :goto_c

    .line 784
    :cond_8
    invoke-virtual {v0, p0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPropertyIgnoralByName(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p2

    .line 785
    :goto_c
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultPropertyIgnorals(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    .line 786
    invoke-static {p2, p0}, Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;->merge(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultPropertyInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 1

    .line 735
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->getDefaultInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultPropertyInclusion(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;"
        }
    .end annotation

    .line 740
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getConfigOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getInclude()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p1

    .line 741
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultPropertyInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    if-nez p0, :cond_f

    return-object p1

    .line 745
    :cond_f
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultPropertyInclusions(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;"
        }
    .end annotation

    .line 793
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p1

    if-nez p1, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 794
    :cond_8
    invoke-virtual {p1, p0, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPropertyInclusionByName(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonIncludeProperties$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultSetterInfo()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;
    .registers 1

    .line 849
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->getDefaultSetterInfo()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

    move-result-object p0

    return-object p0
.end method

.method public final getDefaultVisibilityChecker()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;"
        }
    .end annotation

    .line 800
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->getDefaultVisibility()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 803
    iget-wide v1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    sget-wide v3, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->AUTO_DETECT_MASK:J

    and-long/2addr v1, v3

    cmp-long v1, v1, v3

    if-eqz v1, :cond_56

    .line 804
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_FIELDS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-nez v1, :cond_1d

    .line 805
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-interface {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withFieldVisibility(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 807
    :cond_1d
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_GETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-nez v1, :cond_2b

    .line 808
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-interface {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withGetterVisibility(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 810
    :cond_2b
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_IS_GETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-nez v1, :cond_39

    .line 811
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-interface {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withIsGetterVisibility(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 813
    :cond_39
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_SETTERS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v1

    if-nez v1, :cond_47

    .line 814
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-interface {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withSetterVisibility(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 816
    :cond_47
    sget-object v1, Lcom/fasterxml/jackson/databind/MapperFeature;->AUTO_DETECT_CREATORS:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p0

    if-nez p0, :cond_56

    .line 817
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withCreatorVisibility(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object p0

    return-object p0

    :cond_56
    return-object v0
.end method

.method public final getDefaultVisibilityChecker(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;"
        }
    .end annotation

    .line 831
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isJDKClass(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 832
    invoke-static {}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker$Std;->allPublicInstance()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker$Std;

    move-result-object v0

    goto :goto_f

    .line 834
    :cond_b
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultVisibilityChecker()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 836
    :goto_f
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v1

    if-eqz v1, :cond_19

    .line 838
    invoke-virtual {v1, p2, v0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findAutoDetectVisibility(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object v0

    .line 840
    :cond_19
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_configOverrides:Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->findOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    move-result-object p0

    if-eqz p0, :cond_2a

    .line 842
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;->withOverrides(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    move-result-object p0

    return-object p0

    :cond_2a
    return-object v0
.end method

.method public final getFullRootName()Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 1

    .line 703
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_rootName:Lcom/fasterxml/jackson/databind/PropertyName;

    return-object p0
.end method

.method public final getSubtypeResolver()Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;
    .registers 1

    .line 688
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_subtypeResolver:Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;

    return-object p0
.end method

.method public final with(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;",
            ")TT;"
        }
    .end annotation

    .line 562
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->withPropertyNamingStrategy(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;

    move-result-object p0

    return-object p0
.end method

.method public final varargs with([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/fasterxml/jackson/databind/MapperFeature;",
            ")TT;"
        }
    .end annotation

    .line 339
    iget-wide v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    .line 340
    array-length v2, p1

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_10

    aget-object v4, p1, v3

    .line 341
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v4

    or-long/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 343
    :cond_10
    iget-wide v2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_17

    return-object p0

    .line 346
    :cond_17
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_withMapperFeatures(J)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;

    move-result-object p0

    return-object p0
.end method

.method public final withAppendedAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            ")TT;"
        }
    .end annotation

    .line 463
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->withAppendedAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;

    move-result-object p0

    return-object p0
.end method

.method public final withInsertedAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            ")TT;"
        }
    .end annotation

    .line 471
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_base:Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/cfg/BaseSettings;->withInsertedAnnotationIntrospector(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;

    move-result-object p0

    return-object p0
.end method

.method public final varargs without([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/fasterxml/jackson/databind/MapperFeature;",
            ")TT;"
        }
    .end annotation

    .line 357
    iget-wide v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    .line 358
    array-length v2, p1

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_11

    aget-object v4, p1, v3

    .line 359
    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/MapperFeature;->getLongMask()J

    move-result-wide v4

    not-long v4, v4

    and-long/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 361
    :cond_11
    iget-wide v2, p0, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->_mapperFeatures:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_18

    return-object p0

    .line 364
    :cond_18
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->_withMapperFeatures(J)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;

    move-result-object p0

    return-object p0
.end method
