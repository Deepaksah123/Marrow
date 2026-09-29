###### Class com.fasterxml.jackson.databind.cfg.CoercionConfigs (com.fasterxml.jackson.databind.cfg.CoercionConfigs)
.class public Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final TARGET_TYPE_COUNT:I


# instance fields
.field protected _defaultAction:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

.field protected final _defaultCoercions:Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

.field protected _perClassCoercions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;",
            ">;"
        }
    .end annotation
.end field

.field protected _perTypeCoercions:[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 19
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/LogicalType;->values()[Lcom/fasterxml/jackson/databind/type/LogicalType;

    move-result-object v0

    array-length v0, v0

    sput v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->TARGET_TYPE_COUNT:I

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 49
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->TryConvert:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    new-instance v1, Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    invoke-direct {v1}, Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v2}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;-><init>(Lcom/fasterxml/jackson/databind/cfg/CoercionAction;Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;Ljava/util/Map;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/CoercionAction;Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;Ljava/util/Map;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/CoercionAction;",
            "Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;",
            "[",
            "Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;",
            ">;)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultCoercions:Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    .line 59
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultAction:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    .line 60
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perTypeCoercions:[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    .line 61
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perClassCoercions:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected _isScalarType(Lcom/fasterxml/jackson/databind/type/LogicalType;)Z
    .registers 2

    .line 330
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Float:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-eq p1, p0, :cond_12

    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Integer:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-eq p1, p0, :cond_12

    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Boolean:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-eq p1, p0, :cond_12

    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->DateTime:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-eq p1, p0, :cond_12

    const/4 p0, 0x0

    return p0

    :cond_12
    const/4 p0, 0x1

    return p0
.end method

.method public findCoercion(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/type/LogicalType;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/LogicalType;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;",
            ")",
            "Lcom/fasterxml/jackson/databind/cfg/CoercionAction;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perClassCoercions:Ljava/util/Map;

    if-eqz v0, :cond_15

    if-eqz p3, :cond_15

    .line 167
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    if-eqz p3, :cond_15

    .line 169
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    if-eqz p3, :cond_15

    return-object p3

    .line 177
    :cond_15
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perTypeCoercions:[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    if-eqz p3, :cond_2a

    if-eqz p2, :cond_2a

    .line 178
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget-object p3, p3, v0

    if-eqz p3, :cond_2a

    .line 180
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    if-eqz p3, :cond_2a

    return-object p3

    .line 188
    :cond_2a
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultCoercions:Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    if-eqz p3, :cond_33

    return-object p3

    .line 194
    :cond_33
    sget-object p3, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v0, 0x1

    if-eq p3, v0, :cond_9c

    const/4 v0, 0x2

    if-eq p3, v0, :cond_53

    const/4 v0, 0x3

    if-ne p3, v0, :cond_65

    .line 207
    sget-object p3, Lcom/fasterxml/jackson/databind/type/LogicalType;->Enum:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-ne p2, p3, :cond_65

    .line 208
    sget-object p3, Lcom/fasterxml/jackson/databind/DeserializationFeature;->FAIL_ON_NUMBERS_FOR_ENUMS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p3

    if-eqz p3, :cond_65

    .line 209
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 200
    :cond_53
    sget-object p3, Lcom/fasterxml/jackson/databind/type/LogicalType;->Integer:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-ne p2, p3, :cond_65

    .line 202
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->ACCEPT_FLOAT_AS_INT:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_62

    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->TryConvert:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    :cond_62
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 218
    :cond_65
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_isScalarType(Lcom/fasterxml/jackson/databind/type/LogicalType;)Z

    move-result p3

    if-eqz p3, :cond_7e

    .line 220
    sget-object v0, Lcom/fasterxml/jackson/databind/MapperFeature;->ALLOW_COERCION_OF_SCALARS:Lcom/fasterxml/jackson/databind/MapperFeature;

    .line 222
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result v0

    if-nez v0, :cond_7e

    sget-object v0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Float:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-ne p2, v0, :cond_7b

    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->Integer:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    if-eq p4, v0, :cond_7e

    .line 228
    :cond_7b
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 231
    :cond_7e
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->EmptyString:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    if-ne p4, v0, :cond_99

    if-nez p3, :cond_96

    .line 234
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->ACCEPT_EMPTY_STRING_AS_NULL_OBJECT:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    .line 236
    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-nez p0, :cond_96

    .line 241
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->OtherScalar:Lcom/fasterxml/jackson/databind/type/LogicalType;

    if-ne p2, p0, :cond_93

    .line 242
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->TryConvert:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 245
    :cond_93
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 237
    :cond_96
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 249
    :cond_99
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultAction:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 197
    :cond_9c
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_a7

    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    :cond_a7
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->Fail:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0
.end method

.method public findCoercionFromBlankString(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/type/LogicalType;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/cfg/CoercionAction;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/LogicalType;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/cfg/CoercionAction;",
            ")",
            "Lcom/fasterxml/jackson/databind/cfg/CoercionAction;"
        }
    .end annotation

    .line 276
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perClassCoercions:Ljava/util/Map;

    if-eqz v0, :cond_19

    if-eqz p3, :cond_19

    .line 277
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    if-eqz p3, :cond_19

    .line 279
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->getAcceptBlankAsEmpty()Ljava/lang/Boolean;

    move-result-object v0

    .line 280
    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->EmptyString:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    goto :goto_1b

    :cond_19
    const/4 v0, 0x0

    move-object p3, v0

    .line 285
    :goto_1b
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_perTypeCoercions:[Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    if-eqz v1, :cond_37

    if-eqz p2, :cond_37

    .line 286
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    if-eqz v1, :cond_37

    if-nez v0, :cond_2f

    .line 289
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->getAcceptBlankAsEmpty()Ljava/lang/Boolean;

    move-result-object v0

    :cond_2f
    if-nez p3, :cond_37

    .line 292
    sget-object p3, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->EmptyString:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {v1, p3}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    :cond_37
    if-nez v0, :cond_3f

    .line 299
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultCoercions:Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->getAcceptBlankAsEmpty()Ljava/lang/Boolean;

    move-result-object v0

    :cond_3f
    if-nez p3, :cond_49

    .line 302
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_defaultCoercions:Lcom/fasterxml/jackson/databind/cfg/MutableCoercionConfig;

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->EmptyString:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfig;->findAction(Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;)Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    move-result-object p3

    .line 306
    :cond_49
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68

    if-eqz p3, :cond_54

    return-object p3

    .line 316
    :cond_54
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;->_isScalarType(Lcom/fasterxml/jackson/databind/type/LogicalType;)Z

    move-result p0

    if-eqz p0, :cond_5d

    .line 317
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    .line 321
    :cond_5d
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->ACCEPT_EMPTY_STRING_AS_NULL_OBJECT:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_68

    .line 322
    sget-object p0, Lcom/fasterxml/jackson/databind/cfg/CoercionAction;->AsNull:Lcom/fasterxml/jackson/databind/cfg/CoercionAction;

    return-object p0

    :cond_68
    return-object p4
.end method

###### Class com.fasterxml.jackson.databind.cfg.CoercionConfigs.AnonymousClass1 (com.fasterxml.jackson.databind.cfg.CoercionConfigs$1)
.class synthetic Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 194
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->values()[Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape:[I

    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->EmptyArray:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->Float:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/CoercionConfigs$1;->$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape:[I

    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;->Integer:Lcom/fasterxml/jackson/databind/cfg/CoercionInputShape;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    return-void
.end method
