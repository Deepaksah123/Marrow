###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.super Lcom/fasterxml/jackson/databind/KeyDeserializer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;,
        Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;,
        Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;,
        Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;
    }
.end annotation


# instance fields
.field protected final _deser:Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _keyClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _kind:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;)V

    return-void
.end method

.method protected constructor <init>(ILjava/lang/Class;Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer<",
            "*>;)V"
        }
    .end annotation

    .line 66
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/KeyDeserializer;-><init>()V

    .line 67
    iput p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_kind:I

    .line 68
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    .line 69
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_deser:Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    return-void
.end method

.method public static forType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;"
        }
    .end annotation

    .line 77
    const-class v0, Ljava/lang/String;

    if-eq p0, v0, :cond_a2

    const-class v0, Ljava/lang/Object;

    if-eq p0, v0, :cond_a2

    const-class v0, Ljava/lang/CharSequence;

    if-eq p0, v0, :cond_a2

    const-class v0, Ljava/io/Serializable;

    if-eq p0, v0, :cond_a2

    .line 83
    const-class v0, Ljava/util/UUID;

    if-ne p0, v0, :cond_18

    const/16 v0, 0xc

    goto/16 :goto_9a

    .line 85
    :cond_18
    const-class v0, Ljava/lang/Integer;

    if-ne p0, v0, :cond_1f

    const/4 v0, 0x5

    goto/16 :goto_9a

    .line 87
    :cond_1f
    const-class v0, Ljava/lang/Long;

    if-ne p0, v0, :cond_26

    const/4 v0, 0x6

    goto/16 :goto_9a

    .line 89
    :cond_26
    const-class v0, Ljava/util/Date;

    if-ne p0, v0, :cond_2e

    const/16 v0, 0xa

    goto/16 :goto_9a

    .line 91
    :cond_2e
    const-class v0, Ljava/util/Calendar;

    if-ne p0, v0, :cond_36

    const/16 v0, 0xb

    goto/16 :goto_9a

    .line 94
    :cond_36
    const-class v0, Ljava/lang/Boolean;

    if-ne p0, v0, :cond_3c

    const/4 v0, 0x1

    goto :goto_9a

    .line 96
    :cond_3c
    const-class v0, Ljava/lang/Byte;

    if-ne p0, v0, :cond_42

    const/4 v0, 0x2

    goto :goto_9a

    .line 98
    :cond_42
    const-class v0, Ljava/lang/Character;

    if-ne p0, v0, :cond_48

    const/4 v0, 0x4

    goto :goto_9a

    .line 100
    :cond_48
    const-class v0, Ljava/lang/Short;

    if-ne p0, v0, :cond_4e

    const/4 v0, 0x3

    goto :goto_9a

    .line 102
    :cond_4e
    const-class v0, Ljava/lang/Float;

    if-ne p0, v0, :cond_54

    const/4 v0, 0x7

    goto :goto_9a

    .line 104
    :cond_54
    const-class v0, Ljava/lang/Double;

    if-ne p0, v0, :cond_5b

    const/16 v0, 0x8

    goto :goto_9a

    .line 106
    :cond_5b
    const-class v0, Ljava/net/URI;

    if-ne p0, v0, :cond_62

    const/16 v0, 0xd

    goto :goto_9a

    .line 108
    :cond_62
    const-class v0, Ljava/net/URL;

    if-ne p0, v0, :cond_69

    const/16 v0, 0xe

    goto :goto_9a

    .line 110
    :cond_69
    const-class v0, Ljava/lang/Class;

    if-ne p0, v0, :cond_70

    const/16 v0, 0xf

    goto :goto_9a

    .line 112
    :cond_70
    const-class v0, Ljava/util/Locale;

    if-ne p0, v0, :cond_82

    .line 113
    const-class v0, Ljava/util/Locale;

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->findDeserializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    move-result-object v0

    .line 114
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;

    const/16 v2, 0x9

    invoke-direct {v1, v2, p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;)V

    return-object v1

    .line 115
    :cond_82
    const-class v0, Ljava/util/Currency;

    if-ne p0, v0, :cond_94

    .line 116
    const-class v0, Ljava/util/Currency;

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->findDeserializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    move-result-object v0

    .line 117
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;)V

    return-object v1

    .line 118
    :cond_94
    const-class v0, [B

    if-ne p0, v0, :cond_a0

    const/16 v0, 0x11

    .line 123
    :goto_9a
    new-instance v1, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;

    invoke-direct {v1, v0, p0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;)V

    return-object v1

    :cond_a0
    const/4 p0, 0x0

    return-object p0

    .line 81
    :cond_a2
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;->forType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected _parse(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 154
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_kind:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_124

    .line 244
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Internal error: unknown key type "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 239
    :pswitch_1c
    :try_start_1c
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getBase64Variant()Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/Base64Variant;->decode(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_28
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1c .. :try_end_28} :catch_29

    return-object p0

    :catch_29
    move-exception v0

    .line 241
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 205
    :pswitch_2f
    :try_start_2f
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_deser:Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->_deserialize(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_35
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2f .. :try_end_35} :catch_36

    return-object p0

    :catch_36
    move-exception v0

    .line 207
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 233
    :pswitch_3c
    :try_start_3c
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_3c .. :try_end_40} :catch_41

    return-object p0

    .line 235
    :catch_41
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const-string v0, "unable to parse key as Class"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 227
    :pswitch_4c
    :try_start_4c
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_51
    .catch Ljava/net/MalformedURLException; {:try_start_4c .. :try_end_51} :catch_52

    return-object v0

    :catch_52
    move-exception v0

    .line 229
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 221
    :pswitch_58
    :try_start_58
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p0
    :try_end_5c
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_5c} :catch_5d

    return-object p0

    :catch_5d
    move-exception v0

    .line 223
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 215
    :pswitch_63
    :try_start_63
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0
    :try_end_67
    .catch Ljava/lang/Exception; {:try_start_63 .. :try_end_67} :catch_68

    return-object p0

    :catch_68
    move-exception v0

    .line 217
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 212
    :pswitch_6e
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->constructCalendar(Ljava/util/Date;)Ljava/util/Calendar;

    move-result-object p0

    return-object p0

    .line 210
    :pswitch_77
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0

    .line 199
    :pswitch_7c
    :try_start_7c
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_deser:Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->_deserialize(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_82
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7c .. :try_end_82} :catch_83

    return-object p0

    :catch_83
    move-exception v0

    .line 201
    invoke-virtual {p0, p2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 196
    :pswitch_89
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 194
    :pswitch_92
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    double-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 190
    :pswitch_9c
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseLong(Ljava/lang/String;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 187
    :pswitch_a5
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 182
    :pswitch_ae
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_be

    .line 183
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    .line 185
    :cond_be
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const-string v0, "can only convert 1-character Strings"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 174
    :pswitch_c9
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v2, -0x8000

    if-lt v0, v2, :cond_db

    const/16 v2, 0x7fff

    if-gt v0, v2, :cond_db

    int-to-short p0, v0

    .line 179
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    .line 176
    :cond_db
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const-string v0, "overflow, value cannot be represented as 16-bit value"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 165
    :pswitch_e6
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v2, -0x80

    if-lt v0, v2, :cond_f8

    const/16 v2, 0xff

    if-gt v0, v2, :cond_f8

    int-to-byte p0, v0

    .line 170
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    .line 168
    :cond_f8
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const-string v0, "overflow, value cannot be represented as 8-bit value"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 156
    :pswitch_103
    const-string v0, "true"

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10e

    .line 157
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 159
    :cond_10e
    const-string v0, "false"

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_119

    .line 160
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 162
    :cond_119
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const-string v0, "value not \'true\' or \'false\'"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :pswitch_data_124
    .packed-switch 0x1
        :pswitch_103
        :pswitch_e6
        :pswitch_c9
        :pswitch_ae
        :pswitch_a5
        :pswitch_9c
        :pswitch_92
        :pswitch_89
        :pswitch_7c
        :pswitch_77
        :pswitch_6e
        :pswitch_63
        :pswitch_58
        :pswitch_4c
        :pswitch_3c
        :pswitch_2f
        :pswitch_1c
    .end packed-switch
.end method

.method protected _parseDouble(Ljava/lang/String;)D
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 263
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method

.method protected _parseInt(Ljava/lang/String;)I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 255
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method protected _parseLong(Ljava/lang/String;)J
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 259
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method protected _weirdKey(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 268
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    .line 269
    invoke-static {p3}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 268
    const-string v0, "problem: %s"

    invoke-virtual {p1, p0, p2, v0, p3}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public deserializeKey(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    .line 134
    :cond_4
    :try_start_4
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_parse(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_8} :catch_2c

    if-eqz v1, :cond_b

    return-object v1

    .line 143
    :cond_b
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    invoke-static {v1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->isEnumType(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 144
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_UNKNOWN_ENUM_VALUES_AS_NULL:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v1

    if-eqz v1, :cond_20

    return-object v0

    .line 147
    :cond_20
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "not a valid representation"

    invoke-virtual {p2, p0, p1, v1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catch_2c
    move-exception v0

    .line 139
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 139
    const-string v1, "not a valid representation, problem: (%s) %s"

    invoke-virtual {p2, p0, p1, v1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.DelegatingKD (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD)
.class final Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;
.super Lcom/fasterxml/jackson/databind/KeyDeserializer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "DelegatingKD"
.end annotation


# instance fields
.field protected final _delegate:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _keyClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;)V"
        }
    .end annotation

    .line 325
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/KeyDeserializer;-><init>()V

    .line 326
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;->_keyClass:Ljava/lang/Class;

    .line 327
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;->_delegate:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-void
.end method


# virtual methods
.method public final deserializeKey(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 338
    :cond_4
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->bufferForInputBuffering()Lcom/fasterxml/jackson/databind/util/TokenBuffer;

    move-result-object v0

    .line 339
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 342
    :try_start_b
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/TokenBuffer;->asParser()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 343
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 344
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;->_delegate:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {v1, v0, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1b

    return-object v0

    .line 348
    :cond_1b
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;->_keyClass:Ljava/lang/Class;

    const-string v1, "not a valid representation"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2, v0, p1, v1, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_26} :catch_27

    return-object p0

    :catch_27
    move-exception v0

    .line 350
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$DelegatingKD;->_keyClass:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "not a valid representation: %s"

    invoke-virtual {p2, p0, p1, v1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.EnumKD (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD)
.class final Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;
.super Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.source "SourceFile"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "EnumKD"
.end annotation


# instance fields
.field protected final _byEnumNamingResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

.field protected volatile _byIndexResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

.field protected final _byNameResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

.field protected volatile _byToStringResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

.field protected final _enumDefaultValue:Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _factory:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/util/EnumResolver;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Lcom/fasterxml/jackson/databind/util/EnumResolver;)V
    .registers 6

    const/4 v0, -0x1

    .line 405
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getEnumClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;)V

    .line 406
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byNameResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    .line 407
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_factory:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 408
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getDefaultValue()Ljava/lang/Enum;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_enumDefaultValue:Ljava/lang/Enum;

    .line 409
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byEnumNamingResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    return-void
.end method

.method private _getIndexResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;
    .registers 3

    .line 472
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byIndexResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    if-nez v0, :cond_1e

    .line 474
    monitor-enter p0

    .line 475
    :try_start_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byIndexResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    if-nez v0, :cond_19

    .line 477
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byNameResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    .line 478
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getEnumClass()Ljava/lang/Class;

    move-result-object v0

    .line 477
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructUsingIndex(Lcom/fasterxml/jackson/databind/DeserializationConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object v0

    .line 479
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byIndexResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;
    :try_end_19
    .catchall {:try_start_5 .. :try_end_19} :catchall_1b

    .line 481
    :cond_19
    monitor-exit p0

    return-object v0

    :catchall_1b
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1e
    return-object v0
.end method

.method private _getToStringResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;
    .registers 3

    .line 457
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byToStringResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    if-nez v0, :cond_1e

    .line 459
    monitor-enter p0

    .line 460
    :try_start_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byToStringResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    if-nez v0, :cond_19

    .line 462
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byNameResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    .line 463
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getEnumClass()Ljava/lang/Class;

    move-result-object v0

    .line 462
    invoke-static {p1, v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->constructUsingToString(Lcom/fasterxml/jackson/databind/DeserializationConfig;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object v0

    .line 464
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byToStringResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;
    :try_end_19
    .catchall {:try_start_5 .. :try_end_19} :catchall_1b

    .line 466
    :cond_19
    monitor-exit p0

    return-object v0

    :catchall_1b
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1e
    return-object v0
.end method


# virtual methods
.method public final _parse(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 415
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_factory:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    if-eqz v0, :cond_d

    .line 417
    :try_start_4
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->call1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_8} :catch_9

    return-object p0

    :catch_9
    move-exception v0

    .line 419
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->unwrapAndThrowAsIAE(Ljava/lang/Throwable;)V

    .line 423
    :cond_d
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_resolveCurrentResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object v0

    .line 424
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->findEnum(Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v1

    if-nez v1, :cond_27

    .line 426
    sget-object v2, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->READ_ENUM_KEYS_USING_INDEX:Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z

    move-result v2

    if-eqz v2, :cond_27

    .line 427
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_getIndexResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object v0

    .line 428
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->findEnum(Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v1

    :cond_27
    if-nez v1, :cond_51

    .line 431
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_enumDefaultValue:Ljava/lang/Enum;

    if-eqz v2, :cond_38

    sget-object v2, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    .line 432
    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v2

    if-eqz v2, :cond_38

    .line 433
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_enumDefaultValue:Ljava/lang/Enum;

    goto :goto_51

    .line 434
    :cond_38
    sget-object v2, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_UNKNOWN_ENUM_VALUES_AS_NULL:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v2

    if-nez v2, :cond_51

    .line 435
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;->_keyClass:Ljava/lang/Class;

    .line 436
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/EnumResolver;->getEnumIds()Ljava/util/Collection;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 435
    const-string v1, "not one of the values accepted for Enum class: %s"

    invoke-virtual {p2, p0, p1, v1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleWeirdKey(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_51
    :goto_51
    return-object v1
.end method

.method protected final _resolveCurrentResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;
    .registers 3

    .line 447
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byEnumNamingResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    if-eqz v0, :cond_5

    return-object v0

    .line 450
    :cond_5
    sget-object v0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->READ_ENUMS_USING_TO_STRING:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 451
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_getToStringResolver(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/util/EnumResolver;

    move-result-object p0

    return-object p0

    :cond_12
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$EnumKD;->_byNameResolver:Lcom/fasterxml/jackson/databind/util/EnumResolver;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringCtorKeyDeserializer (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer)
.class final Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "StringCtorKeyDeserializer"
.end annotation


# instance fields
.field protected final _ctor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    .line 498
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;)V

    .line 499
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;->_ctor:Ljava/lang/reflect/Constructor;

    return-void
.end method


# virtual methods
.method public final _parse(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 505
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringCtorKeyDeserializer;->_ctor:Ljava/lang/reflect/Constructor;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringFactoryKeyDeserializer (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer)
.class final Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "StringFactoryKeyDeserializer"
.end annotation


# instance fields
.field final _factoryMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .registers 4

    const/4 v0, -0x1

    .line 520
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;)V

    .line 521
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;->_factoryMethod:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final _parse(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 527
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringFactoryKeyDeserializer;->_factoryMethod:Ljava/lang/reflect/Method;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringKD (com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD)
.class final Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;
.super Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.source "SourceFile"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "StringKD"
.end annotation


# static fields
.field private static final sObject:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

.field private static final sString:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 282
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    const-class v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;->sString:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    .line 283
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    const-class v1, Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;->sObject:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    .line 285
    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;-><init>(ILjava/lang/Class;)V

    return-void
.end method

.method public static forType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;"
        }
    .end annotation

    .line 289
    const-class v0, Ljava/lang/String;

    if-ne p0, v0, :cond_7

    .line 290
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;->sString:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    return-object p0

    .line 292
    :cond_7
    const-class v0, Ljava/lang/Object;

    if-ne p0, v0, :cond_e

    .line 293
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;->sObject:Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    return-object p0

    .line 295
    :cond_e
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer$StringKD;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method


# virtual methods
.method public final deserializeKey(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-object p1
.end method
