###### Class com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR (com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR)
.class final Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;
.super Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
.source "SourceFile"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field protected static final NO_OBJECTS:[Ljava/lang/Object;

.field public static final std:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;


# instance fields
.field protected final _nonMerging:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->NO_OBJECTS:[Ljava/lang/Object;

    .line 34
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->std:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;-><init>(Z)V

    return-void
.end method

.method protected constructor <init>(Z)V
    .registers 3

    .line 42
    const-class v0, Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Ljava/lang/Class;)V

    .line 43
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_nonMerging:Z

    return-void
.end method

.method private _deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    packed-switch p3, :pswitch_data_42

    .line 360
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 353
    :pswitch_c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getEmbeddedObject()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :pswitch_11
    const/4 p0, 0x0

    return-object p0

    .line 351
    :pswitch_13
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 349
    :pswitch_16
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 344
    :pswitch_19
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_DECIMAL_FOR_FLOATS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_26

    .line 345
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    .line 347
    :cond_26
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0

    .line 338
    :pswitch_2b
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_INTEGER_FOR_INTS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_38

    .line 339
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getBigIntegerValue()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 341
    :cond_38
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0

    .line 336
    :pswitch_3d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_42
    .packed-switch 0x6
        :pswitch_3d
        :pswitch_2b
        :pswitch_19
        :pswitch_16
        :pswitch_13
        :pswitch_11
        :pswitch_c
    .end packed-switch
.end method

.method private _deserializeNR(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)Ljava/lang/Object;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 219
    sget v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->F_MASK_INT_COERCIONS:I

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->hasSomeOfFeatures(I)Z

    move-result v0

    .line 220
    sget-object v1, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_JAVA_ARRAY_FOR_JSON_ARRAY:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v1

    move-object v2, p3

    .line 226
    :goto_d
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->isObject()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_85

    .line 227
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v3

    :goto_18
    if-eqz v3, :cond_79

    .line 232
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v5

    if-nez v5, :cond_22

    .line 234
    sget-object v5, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 236
    :cond_22
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_70

    const/4 v6, 0x3

    if-eq v5, v6, :cond_6b

    packed-switch v5, :pswitch_data_ea

    .line 268
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 265
    :pswitch_38
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getEmbeddedObject()Ljava/lang/Object;

    move-result-object v5

    goto :goto_67

    :pswitch_3d
    move-object v5, v4

    goto :goto_67

    .line 259
    :pswitch_3f
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_67

    .line 256
    :pswitch_42
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_67

    .line 252
    :pswitch_45
    sget-object v5, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_DECIMAL_FOR_FLOATS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v5}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v5

    if-eqz v5, :cond_52

    .line 253
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object v5

    goto :goto_67

    :cond_52
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v5

    goto :goto_67

    :pswitch_57
    if-eqz v0, :cond_5e

    .line 249
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_coerceIntegral(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_67

    :cond_5e
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v5

    goto :goto_67

    .line 246
    :pswitch_63
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v5

    .line 270
    :goto_67
    invoke-virtual {v2, v3, v5}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->putValue(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_74

    .line 242
    :cond_6b
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    goto :goto_d

    .line 238
    :cond_70
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childObject(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    .line 230
    :goto_74
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v3

    goto :goto_18

    :cond_79
    if-ne v2, p3, :cond_80

    .line 274
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishRootObject()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 276
    :cond_80
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishBranchObject()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    goto :goto_d

    .line 281
    :cond_85
    :goto_85
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    if-nez v3, :cond_8d

    .line 283
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 286
    :cond_8d
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v3

    packed-switch v3, :pswitch_data_fc

    .line 322
    :pswitch_94
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 319
    :pswitch_9d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getEmbeddedObject()Ljava/lang/Object;

    move-result-object v3

    goto :goto_cc

    :pswitch_a2
    move-object v3, v4

    goto :goto_cc

    .line 313
    :pswitch_a4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_cc

    .line 310
    :pswitch_a7
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_cc

    .line 306
    :pswitch_aa
    sget-object v3, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_DECIMAL_FOR_FLOATS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v3

    if-eqz v3, :cond_b7

    .line 307
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object v3

    goto :goto_cc

    :cond_b7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v3

    goto :goto_cc

    :pswitch_bc
    if-eqz v0, :cond_c3

    .line 303
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_coerceIntegral(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_cc

    :cond_c3
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v3

    goto :goto_cc

    .line 300
    :pswitch_c8
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v3

    .line 324
    :goto_cc
    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->addValue(Ljava/lang/Object;)V

    goto :goto_85

    :pswitch_d0
    if-ne v2, p3, :cond_d7

    .line 295
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishRootArray(Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 297
    :cond_d7
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishBranchArray(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    goto/16 :goto_d

    .line 291
    :pswitch_dd
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    goto/16 :goto_d

    .line 288
    :pswitch_e3
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childObject()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    goto/16 :goto_d

    nop

    :pswitch_data_ea
    .packed-switch 0x6
        :pswitch_63
        :pswitch_57
        :pswitch_45
        :pswitch_42
        :pswitch_3f
        :pswitch_3d
        :pswitch_38
    .end packed-switch

    :pswitch_data_fc
    .packed-switch 0x1
        :pswitch_e3
        :pswitch_94
        :pswitch_dd
        :pswitch_d0
        :pswitch_94
        :pswitch_c8
        :pswitch_bc
        :pswitch_aa
        :pswitch_a7
        :pswitch_a4
        :pswitch_a2
        :pswitch_9d
    .end packed-switch
.end method

.method private _deserializeObjectAtName(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 190
    sget-object v0, Lcom/fasterxml/jackson/core/StreamReadCapability;->DUPLICATE_PROPERTIES:Lcom/fasterxml/jackson/core/StreamReadCapability;

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadCapability;)Z

    move-result v0

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->rootObjectScope(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v0

    .line 191
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v1

    :goto_e
    if-eqz v1, :cond_4c

    .line 194
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    if-nez v2, :cond_18

    .line 196
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 198
    :cond_18
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3c

    const/4 v4, 0x2

    if-eq v3, v4, :cond_37

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2e

    .line 208
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v2

    invoke-direct {p0, p1, p2, v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_44

    .line 205
    :cond_2e
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    invoke-direct {p0, p1, p2, v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeNR(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_44

    .line 203
    :cond_37
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishRootObject()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 200
    :cond_3c
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->childObject()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v2

    invoke-direct {p0, p1, p2, v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeNR(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)Ljava/lang/Object;

    move-result-object v2

    .line 210
    :goto_44
    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->putValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    .line 212
    :cond_4c
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->finishRootObject()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static instance(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;
    .registers 2

    if-eqz p0, :cond_9

    .line 48
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;-><init>(Z)V

    return-object p0

    .line 50
    :cond_9
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->std:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;

    return-object p0
.end method


# virtual methods
.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v0

    packed-switch v0, :pswitch_data_68

    .line 103
    :pswitch_7
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->getValueType(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 100
    :pswitch_10
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getEmbeddedObject()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :pswitch_15
    const/4 p0, 0x0

    return-object p0

    .line 96
    :pswitch_17
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 94
    :pswitch_1a
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 89
    :pswitch_1d
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_DECIMAL_FOR_FLOATS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_2a

    .line 90
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    .line 92
    :cond_2a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0

    .line 84
    :pswitch_2f
    sget v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->F_MASK_INT_COERCIONS:I

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->hasSomeOfFeatures(I)Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 85
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_coerceIntegral(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 87
    :cond_3c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0

    .line 82
    :pswitch_41
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 77
    :pswitch_46
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeObjectAtName(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 79
    :pswitch_4b
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->rootArrayScope()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeNR(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 75
    :pswitch_54
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->emptyMap()Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 70
    :pswitch_59
    sget-object v0, Lcom/fasterxml/jackson/core/StreamReadCapability;->DUPLICATE_PROPERTIES:Lcom/fasterxml/jackson/core/StreamReadCapability;

    .line 71
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadCapability;)Z

    move-result v0

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->rootObjectScope(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object v0

    .line 70
    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeNR(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :pswitch_data_68
    .packed-switch 0x1
        :pswitch_59
        :pswitch_54
        :pswitch_4b
        :pswitch_7
        :pswitch_46
        :pswitch_41
        :pswitch_2f
        :pswitch_1d
        :pswitch_1a
        :pswitch_17
        :pswitch_15
        :pswitch_10
    .end packed-switch
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_nonMerging:Z

    if-eqz v0, :cond_9

    .line 127
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 129
    :cond_9
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_72

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1d

    const/4 v1, 0x4

    if-eq v0, v1, :cond_72

    const/4 v1, 0x5

    if-eq v0, v1, :cond_44

    goto :goto_6d

    .line 165
    :cond_1d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 166
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_72

    .line 171
    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_6d

    .line 172
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    .line 175
    :cond_2c
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 176
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v2, :cond_2c

    goto :goto_72

    .line 135
    :cond_3c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 136
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_72

    .line 142
    :cond_44
    instance-of v0, p3, Ljava/util/Map;

    if-eqz v0, :cond_6d

    .line 143
    move-object v0, p3

    check-cast v0, Ljava/util/Map;

    .line 145
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v1

    .line 147
    :cond_4f
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 149
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5d

    .line 152
    invoke-virtual {p0, p1, p2, v2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_61

    .line 154
    :cond_5d
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v3

    :goto_61
    if-eq v3, v2, :cond_66

    .line 157
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_66
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4f

    goto :goto_72

    .line 184
    :cond_6d
    :goto_6d
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_72
    :goto_72
    return-object p3
.end method

.method public final deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_16

    const/4 v1, 0x3

    if-eq v0, v1, :cond_16

    const/4 v1, 0x5

    if-eq v0, v1, :cond_16

    .line 117
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result p3

    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 115
    :cond_16
    invoke-virtual {p3, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->deserializeTypedFromAny(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;
    .registers 1

    .line 55
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Untyped:Lcom/fasterxml/jackson/databind/type/LogicalType;

    return-object p0
.end method

.method public final supportsUpdate(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Ljava/lang/Boolean;
    .registers 2

    .line 62
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->_nonMerging:Z

    if-eqz p0, :cond_7

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.Scope (com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR$Scope)
.class final Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Scope"
.end annotation


# instance fields
.field private _child:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

.field private _deferredKey:Ljava/lang/String;

.field private _isObject:Z

.field private _list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private _map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final _parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

.field private _squashDups:Z


# direct methods
.method private constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)V
    .registers 2

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 432
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    const/4 p1, 0x0

    .line 433
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_isObject:Z

    .line 434
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;ZZ)V
    .registers 4

    .line 438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 439
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    .line 440
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_isObject:Z

    .line 441
    iput-boolean p3, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    return-void
.end method

.method private _putValueHandleDups(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 5

    .line 605
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    if-nez v0, :cond_f

    .line 606
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    .line 607
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 610
    :cond_f
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_35

    .line 613
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_25

    .line 614
    move-object v1, v0

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 615
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 617
    :cond_25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 618
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 619
    invoke-virtual {v1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 620
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_35
    return-void
.end method

.method public static emptyList()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 637
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public static emptyMap()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 633
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    return-object v0
.end method

.method private resetAsArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 2

    const/4 v0, 0x0

    .line 453
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_isObject:Z

    return-object p0
.end method

.method private resetAsObject(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 3

    const/4 v0, 0x1

    .line 458
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_isObject:Z

    .line 459
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    return-object p0
.end method

.method public static rootArrayScope()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 2

    .line 449
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)V

    return-object v0
.end method

.method public static rootObjectScope(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 4

    .line 445
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;ZZ)V

    return-object v0
.end method


# virtual methods
.method public final addValue(Ljava/lang/Object;)V
    .registers 3

    .line 535
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    if-nez v0, :cond_b

    .line 536
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    .line 538
    :cond_b
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final childArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 2

    .line 479
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_child:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    if-nez v0, :cond_a

    .line 480
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)V

    return-object v0

    .line 482
    :cond_a
    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->resetAsArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0
.end method

.method public final childArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 2

    .line 486
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_deferredKey:Ljava/lang/String;

    .line 487
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_child:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    if-nez p1, :cond_c

    .line 488
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;)V

    return-object p1

    .line 490
    :cond_c
    invoke-direct {p1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->resetAsArray()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0
.end method

.method public final childObject()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 4

    .line 464
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_child:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    if-nez v0, :cond_d

    .line 465
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    invoke-direct {v0, p0, v1, v2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;ZZ)V

    return-object v0

    .line 467
    :cond_d
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->resetAsObject(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0
.end method

.method public final childObject(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 4

    .line 471
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_deferredKey:Ljava/lang/String;

    .line 472
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_child:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    if-nez p1, :cond_f

    .line 473
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    invoke-direct {p1, p0, v0, v1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;-><init>(Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;ZZ)V

    return-object p1

    .line 475
    :cond_f
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->resetAsObject(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0
.end method

.method public final finishBranchArray(Z)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 3

    .line 578
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    if-nez v0, :cond_e

    if-eqz p1, :cond_9

    .line 580
    sget-object p1, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->NO_OBJECTS:[Ljava/lang/Object;

    goto :goto_1a

    .line 582
    :cond_9
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_1a

    :cond_e
    if-eqz p1, :cond_16

    .line 586
    sget-object p1, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->NO_OBJECTS:[Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    :cond_16
    const/4 p1, 0x0

    .line 590
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    move-object p1, v0

    .line 592
    :goto_1a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->isObject()Z

    move-result v0

    if-eqz v0, :cond_29

    .line 593
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->putDeferredValue(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0

    .line 595
    :cond_29
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->addValue(Ljava/lang/Object;)V

    .line 596
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    return-object p0
.end method

.method public final finishBranchObject()Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 3

    .line 550
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    if-nez v0, :cond_a

    .line 551
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_d

    :cond_a
    const/4 v1, 0x0

    .line 554
    iput-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    .line 556
    :goto_d
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->isObject()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 557
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->putDeferredValue(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    move-result-object p0

    return-object p0

    .line 559
    :cond_1c
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->addValue(Ljava/lang/Object;)V

    .line 560
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_parent:Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;

    return-object p0
.end method

.method public final finishRootArray(Z)Ljava/lang/Object;
    .registers 2

    .line 564
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_list:Ljava/util/List;

    if-nez p0, :cond_e

    if-eqz p1, :cond_9

    .line 566
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->NO_OBJECTS:[Ljava/lang/Object;

    return-object p0

    .line 568
    :cond_9
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_e
    if-eqz p1, :cond_16

    .line 571
    sget-object p1, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR;->NO_OBJECTS:[Ljava/lang/Object;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    :cond_16
    return-object p0
.end method

.method public final finishRootObject()Ljava/lang/Object;
    .registers 1

    .line 542
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    if-nez p0, :cond_8

    .line 543
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->emptyMap()Ljava/util/Map;

    move-result-object p0

    :cond_8
    return-object p0
.end method

.method public final isObject()Z
    .registers 1

    .line 500
    iget-boolean p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_isObject:Z

    return p0
.end method

.method public final putDeferredValue(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;
    .registers 4

    .line 521
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_deferredKey:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    .line 522
    iput-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_deferredKey:Ljava/lang/String;

    .line 523
    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    if-eqz v1, :cond_13

    .line 524
    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_putValueHandleDups(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0

    .line 527
    :cond_13
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    if-nez v1, :cond_1e

    .line 528
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    .line 530
    :cond_1e
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putValue(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 4

    .line 510
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_squashDups:Z

    if-eqz v0, :cond_8

    .line 511
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_putValueHandleDups(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 514
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    if-nez v0, :cond_13

    .line 515
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    .line 517
    :cond_13
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializerNR$Scope;->_map:Ljava/util/Map;

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
