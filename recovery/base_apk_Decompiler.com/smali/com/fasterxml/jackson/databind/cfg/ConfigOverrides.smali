###### Class com.fasterxml.jackson.databind.cfg.ConfigOverrides (com.fasterxml.jackson.databind.cfg.ConfigOverrides)
.class public Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected _defaultInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

.field protected _defaultLeniency:Ljava/lang/Boolean;

.field protected _defaultMergeable:Ljava/lang/Boolean;

.field protected _defaultSetterInfo:Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

.field protected _overrides:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected _visibilityChecker:Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 8

    .line 66
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonInclude$Value;->empty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    move-result-object v2

    .line 67
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonSetter$Value;->empty()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

    move-result-object v3

    .line 68
    invoke-static {}, Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker$Std;->defaultInstance()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker$Std;

    move-result-object v4

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 64
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;-><init>(Ljava/util/Map;Lcom/fasterxml/jackson/annotation/JsonInclude$Value;Lcom/fasterxml/jackson/annotation/JsonSetter$Value;Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method protected constructor <init>(Ljava/util/Map;Lcom/fasterxml/jackson/annotation/JsonInclude$Value;Lcom/fasterxml/jackson/annotation/JsonSetter$Value;Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;",
            "Lcom/fasterxml/jackson/annotation/JsonSetter$Value;",
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_overrides:Ljava/util/Map;

    .line 81
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    .line 82
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultSetterInfo:Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

    .line 83
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_visibilityChecker:Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    .line 84
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultMergeable:Ljava/lang/Boolean;

    .line 85
    iput-object p6, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultLeniency:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public findFormatDefaults(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;"
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_overrides:Ljava/util/Map;

    if-eqz v0, :cond_20

    .line 150
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    if-eqz p1, :cond_20

    .line 152
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->getFormat()Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p1

    if-eqz p1, :cond_20

    .line 154
    invoke-virtual {p1}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->hasLenient()Z

    move-result v0

    if-nez v0, :cond_1f

    .line 155
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultLeniency:Ljava/lang/Boolean;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->withLenient(Ljava/lang/Boolean;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    return-object p0

    :cond_1f
    return-object p1

    .line 161
    :cond_20
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultLeniency:Ljava/lang/Boolean;

    if-nez p0, :cond_29

    .line 162
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->empty()Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    return-object p0

    .line 164
    :cond_29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->forLeniency(Z)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object p0

    return-object p0
.end method

.method public findOverride(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;"
        }
    .end annotation

    .line 121
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_overrides:Ljava/util/Map;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 124
    :cond_6
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;

    return-object p0
.end method

.method public getDefaultInclusion()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 1

    .line 174
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultInclusion:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0
.end method

.method public getDefaultMergeable()Ljava/lang/Boolean;
    .registers 1

    .line 182
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultMergeable:Ljava/lang/Boolean;

    return-object p0
.end method

.method public getDefaultSetterInfo()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;
    .registers 1

    .line 178
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_defaultSetterInfo:Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

    return-object p0
.end method

.method public getDefaultVisibility()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<",
            "*>;"
        }
    .end annotation

    .line 196
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;->_visibilityChecker:Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;

    return-object p0
.end method
