###### Class com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer (com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer)
.class abstract Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        ">",
        "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer<",
        "TT;>;",
        "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;"
    }
.end annotation


# instance fields
.field protected final _mergeArrays:Z

.field protected final _mergeObjects:Z

.field protected final _supportsUpdates:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;ZZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer<",
            "*>;ZZ)V"
        }
    .end annotation

    .line 266
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;)V

    .line 267
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_supportsUpdates:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_supportsUpdates:Ljava/lang/Boolean;

    .line 268
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeArrays:Z

    .line 269
    iput-boolean p3, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeObjects:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Boolean;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 257
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Ljava/lang/Class;)V

    .line 258
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_supportsUpdates:Ljava/lang/Boolean;

    const/4 p1, 0x1

    .line 259
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeArrays:Z

    .line 260
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeObjects:Z

    return-void
.end method

.method private static _shouldMerge(Ljava/lang/Boolean;Ljava/lang/Boolean;)Z
    .registers 2

    if-eqz p0, :cond_7

    .line 322
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_7
    if-eqz p1, :cond_e

    .line 325
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method protected abstract _createWithMerge(ZZ)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation
.end method

.method protected final _deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 662
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v0

    .line 663
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_42

    packed-switch v1, :pswitch_data_48

    .line 684
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0

    .line 679
    :pswitch_19
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromEmbedded(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 677
    :pswitch_1e
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0

    :pswitch_23
    const/4 p0, 0x0

    .line 675
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object p0

    return-object p0

    :pswitch_29
    const/4 p0, 0x1

    .line 673
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object p0

    return-object p0

    .line 671
    :pswitch_2f
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromFloat(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 669
    :pswitch_34
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromInt(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 667
    :pswitch_39
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object p0

    return-object p0

    .line 665
    :cond_42
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_48
    .packed-switch 0x6
        :pswitch_39
        :pswitch_34
        :pswitch_2f
        :pswitch_29
        :pswitch_23
        :pswitch_1e
        :pswitch_19
    .end packed-switch
.end method

.method protected final _deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;",
            "Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;",
            "Lcom/fasterxml/jackson/databind/node/ContainerNode<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/node/ContainerNode<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    .line 530
    invoke-virtual/range {p2 .. p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getDeserializationFeatures()I

    move-result v0

    sget v1, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->F_MASK_INT_COERCIONS:I

    and-int v12, v0, v1

    move-object/from16 v0, p5

    .line 534
    :cond_12
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v1, :cond_d6

    .line 535
    move-object v1, v0

    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 536
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v2

    move-object v15, v0

    move-object v7, v1

    move-object v4, v2

    :goto_22
    if-eqz v4, :cond_129

    .line 541
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    if-nez v0, :cond_2c

    .line 543
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 545
    :cond_2c
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v0

    if-eq v0, v14, :cond_b0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_92

    packed-switch v0, :pswitch_data_146

    move-object/from16 v6, p2

    .line 594
    invoke-virtual/range {p0 .. p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeRareScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_76

    .line 588
    :pswitch_3f
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->READ_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    move-object/from16 v6, p2

    invoke-virtual {v6, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 591
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v0

    goto :goto_76

    :cond_4e
    move-object v14, v7

    goto :goto_90

    :pswitch_50
    move-object/from16 v6, p2

    .line 584
    invoke-virtual {v10, v13}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v0

    goto :goto_76

    :pswitch_57
    move-object/from16 v6, p2

    .line 581
    invoke-virtual {v10, v14}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v0

    goto :goto_76

    :pswitch_5e
    move-object/from16 v6, p2

    .line 578
    invoke-virtual/range {p0 .. p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromFloat(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_76

    :pswitch_65
    move-object/from16 v6, p2

    .line 575
    invoke-virtual {v8, v9, v12, v10}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromInt(Lcom/fasterxml/jackson/core/JsonParser;ILcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_76

    :pswitch_6c
    move-object/from16 v6, p2

    .line 572
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object v0

    :goto_76
    move-object v5, v0

    .line 596
    invoke-virtual {v7, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v16

    if-eqz v16, :cond_4e

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v17, v5

    move-object v5, v7

    move-object/from16 v6, v16

    move-object v14, v7

    move-object/from16 v7, v17

    .line 598
    invoke-virtual/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_handleDuplicateField(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)V

    :goto_90
    move-object v7, v14

    goto :goto_cf

    :cond_92
    move-object v14, v7

    .line 561
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v13

    .line 562
    invoke-virtual {v14, v4, v13}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    if-eqz v6, :cond_aa

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v5, v14

    move-object v7, v13

    .line 564
    invoke-virtual/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_handleDuplicateField(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 567
    :cond_aa
    invoke-virtual {v11, v15}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->push(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V

    move-object v0, v13

    goto/16 :goto_143

    :cond_b0
    move-object v14, v7

    .line 548
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v7

    .line 549
    invoke-virtual {v14, v4, v7}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    if-eqz v6, :cond_c9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v5, v14

    move-object v14, v7

    .line 551
    invoke-virtual/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_handleDuplicateField(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_ca

    :cond_c9
    move-object v14, v7

    .line 554
    :goto_ca
    invoke-virtual {v11, v15}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->push(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V

    move-object v7, v14

    move-object v15, v7

    .line 539
    :goto_cf
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x1

    goto/16 :goto_22

    .line 605
    :cond_d6
    move-object v1, v0

    check-cast v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 609
    :goto_d9
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    if-nez v2, :cond_e1

    .line 611
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 613
    :cond_e1
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v2

    packed-switch v2, :pswitch_data_156

    :pswitch_e8
    const/4 v2, 0x1

    .line 645
    invoke-virtual/range {p0 .. p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeRareScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    .line 642
    :pswitch_f1
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    .line 639
    :pswitch_f9
    invoke-virtual {v10, v13}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    :pswitch_101
    const/4 v2, 0x1

    .line 636
    invoke-virtual {v10, v2}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    :pswitch_10a
    const/4 v2, 0x1

    .line 633
    invoke-virtual/range {p0 .. p3}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromFloat(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    :pswitch_113
    const/4 v2, 0x1

    .line 630
    invoke-virtual {v8, v9, v12, v10}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromInt(Lcom/fasterxml/jackson/core/JsonParser;ILcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    :pswitch_11c
    const/4 v2, 0x1

    .line 627
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_d9

    .line 653
    :cond_129
    :pswitch_129
    invoke-virtual/range {p4 .. p4}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->popOrNull()Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object v0

    goto :goto_143

    .line 620
    :pswitch_12e
    invoke-virtual {v11, v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->push(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V

    .line 621
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    .line 622
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_143

    .line 615
    :pswitch_139
    invoke-virtual {v11, v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->push(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V

    .line 616
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    .line 617
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    :goto_143
    if-nez v0, :cond_12

    return-object p5

    :pswitch_data_146
    .packed-switch 0x6
        :pswitch_6c
        :pswitch_65
        :pswitch_5e
        :pswitch_57
        :pswitch_50
        :pswitch_3f
    .end packed-switch

    :pswitch_data_156
    .packed-switch 0x1
        :pswitch_139
        :pswitch_e8
        :pswitch_12e
        :pswitch_129
        :pswitch_e8
        :pswitch_11c
        :pswitch_113
        :pswitch_10a
        :pswitch_101
        :pswitch_f9
        :pswitch_f1
    .end packed-switch
.end method

.method protected final _deserializeObjectAtName(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .registers 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 397
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v8

    .line 398
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    :goto_9
    if-eqz v4, :cond_5c

    .line 401
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    if-nez v0, :cond_13

    .line 403
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 405
    :cond_13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_34

    const/4 v1, 0x3

    if-eq v0, v1, :cond_22

    .line 415
    invoke-virtual/range {p0 .. p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeAnyScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_45

    .line 412
    :cond_22
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v14

    move-object v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    .line 411
    invoke-virtual/range {v9 .. v14}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object v0

    goto :goto_45

    .line 408
    :cond_34
    invoke-virtual/range {p3 .. p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v14

    move-object v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    .line 407
    invoke-virtual/range {v9 .. v14}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object v0

    :goto_45
    move-object v7, v0

    .line 417
    invoke-virtual {v8, v4, v7}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    if-eqz v6, :cond_57

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v5, v8

    .line 419
    invoke-virtual/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_handleDuplicateField(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 399
    :cond_57
    invoke-virtual/range {p1 .. p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v4

    goto :goto_9

    :cond_5c
    return-object v8
.end method

.method protected final _deserializeRareScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 691
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentTokenId()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_28

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1f

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1a

    .line 702
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->handledType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0

    .line 697
    :cond_1a
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromEmbedded(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 695
    :cond_1f
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromFloat(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 693
    :cond_28
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0
.end method

.method protected final _fromBigDecimal(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 4

    .line 779
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getDatatypeFeatures()Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    move-result-object p0

    .line 780
    sget-object p1, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->STRIP_TRAILING_BIGDECIMAL_ZEROES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->isExplicitlySet(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 781
    sget-object p1, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->STRIP_TRAILING_BIGDECIMAL_ZEROES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z

    move-result p0

    goto :goto_17

    .line 783
    :cond_13
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->willStripTrailingBigDecimalZeroes()Z

    move-result p0

    :goto_17
    if-eqz p0, :cond_1d

    .line 807
    :try_start_19
    invoke-virtual {p3}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object p3
    :try_end_1d
    .catch Ljava/lang/ArithmeticException; {:try_start_19 .. :try_end_1d} :catch_1d

    .line 813
    :catch_1d
    :cond_1d
    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0
.end method

.method protected final _fromEmbedded(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 819
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object p0

    .line 820
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getEmbeddedObject()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_f

    .line 823
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0

    .line 825
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 826
    const-class v0, [B

    if-ne p2, v0, :cond_1e

    .line 827
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->binaryNode([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;

    move-result-object p0

    return-object p0

    .line 830
    :cond_1e
    instance-of p2, p1, Lcom/fasterxml/jackson/databind/util/RawValue;

    if-eqz p2, :cond_29

    .line 831
    check-cast p1, Lcom/fasterxml/jackson/databind/util/RawValue;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->rawValueNode(Lcom/fasterxml/jackson/databind/util/RawValue;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0

    .line 833
    :cond_29
    instance-of p2, p1, Lcom/fasterxml/jackson/databind/JsonNode;

    if-eqz p2, :cond_30

    .line 835
    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p1

    .line 838
    :cond_30
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->pojoNode(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0
.end method

.method protected final _fromFloat(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 753
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object v0

    .line 754
    sget-object v1, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_DECIMAL:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne v0, v1, :cond_11

    .line 755
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, p2, p3, p1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromBigDecimal(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 757
    :cond_11
    sget-object v1, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_DECIMAL_FOR_FLOATS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v1

    if-eqz v1, :cond_31

    .line 760
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isNaN()Z

    move-result v0

    if-eqz v0, :cond_28

    .line 761
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDoubleValue()D

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(D)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 763
    :cond_28
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, p2, p3, p1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromBigDecimal(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    return-object p0

    .line 765
    :cond_31
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->FLOAT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne v0, p0, :cond_3e

    .line 766
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getFloatValue()F

    move-result p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(F)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 768
    :cond_3e
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getDoubleValue()D

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(D)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0
.end method

.method protected final _fromInt(Lcom/fasterxml/jackson/core/JsonParser;ILcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_1c

    .line 709
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_INTEGER_FOR_INTS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/databind/DeserializationFeature;->enabledIn(I)Z

    move-result p0

    if-eqz p0, :cond_13

    .line 710
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getBigIntegerValue()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0

    .line 712
    :cond_13
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getLongValue()J

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(J)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 714
    :cond_1c
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object p0

    .line 715
    sget-object p2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->INT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne p0, p2, :cond_2d

    .line 716
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(I)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 718
    :cond_2d
    sget-object p2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne p0, p2, :cond_3a

    .line 719
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getLongValue()J

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(J)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 721
    :cond_3a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getBigIntegerValue()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0
.end method

.method protected final _fromInt(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 728
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getDeserializationFeatures()I

    move-result p0

    .line 729
    sget p2, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->F_MASK_INT_COERCIONS:I

    and-int/2addr p2, p0

    if-eqz p2, :cond_24

    .line 730
    sget-object p2, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_BIG_INTEGER_FOR_INTS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationFeature;->enabledIn(I)Z

    move-result p2

    if-eqz p2, :cond_14

    .line 731
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_INTEGER:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    goto :goto_28

    .line 732
    :cond_14
    sget-object p2, Lcom/fasterxml/jackson/databind/DeserializationFeature;->USE_LONG_FOR_INTS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationFeature;->enabledIn(I)Z

    move-result p0

    if-eqz p0, :cond_1f

    .line 733
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    goto :goto_28

    .line 735
    :cond_1f
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object p0

    goto :goto_28

    .line 738
    :cond_24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object p0

    .line 740
    :goto_28
    sget-object p2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->INT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne p0, p2, :cond_35

    .line 741
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(I)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 743
    :cond_35
    sget-object p2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    if-ne p0, p2, :cond_42

    .line 744
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getLongValue()J

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(J)Lcom/fasterxml/jackson/databind/node/NumericNode;

    move-result-object p0

    return-object p0

    .line 746
    :cond_42
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getBigIntegerValue()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->numberNode(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;

    move-result-object p0

    return-object p0
.end method

.method protected _handleDuplicateField(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 360
    sget-object p0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->FAIL_ON_READING_DUP_TREE_KEY:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result p0

    if-eqz p0, :cond_13

    .line 364
    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p0

    const-class p1, Lcom/fasterxml/jackson/databind/JsonNode;

    const-string v0, "Duplicate field \'%s\' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled"

    invoke-virtual {p2, p1, v0, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->reportInputMismatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    :cond_13
    sget-object p0, Lcom/fasterxml/jackson/core/StreamReadCapability;->DUPLICATE_PROPERTIES:Lcom/fasterxml/jackson/core/StreamReadCapability;

    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadCapability;)Z

    move-result p0

    if-eqz p0, :cond_38

    .line 372
    invoke-virtual {p6}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result p0

    if-eqz p0, :cond_2b

    .line 373
    move-object p0, p6

    check-cast p0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-virtual {p0, p7}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 374
    invoke-virtual {p5, p4, p6}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    return-void

    .line 376
    :cond_2b
    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    .line 377
    invoke-virtual {p0, p6}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 378
    invoke-virtual {p0, p7}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 379
    invoke-virtual {p5, p4, p0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    :cond_38
    return-void
.end method

.method public createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 304
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getConfig()Lcom/fasterxml/jackson/databind/DeserializationConfig;

    move-result-object p1

    .line 305
    const-class p2, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultMergeable(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object p2

    .line 306
    const-class v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultMergeable(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    .line 307
    const-class v1, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;->getDefaultMergeable(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object p1

    .line 309
    invoke-static {p2, p1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_shouldMerge(Ljava/lang/Boolean;Ljava/lang/Boolean;)Z

    move-result p2

    .line 310
    invoke-static {v0, p1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_shouldMerge(Ljava/lang/Boolean;Ljava/lang/Boolean;)Z

    move-result p1

    .line 312
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeArrays:Z

    if-ne p2, v0, :cond_27

    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeObjects:Z

    if-ne p1, v0, :cond_27

    return-object p0

    .line 314
    :cond_27
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_createWithMerge(ZZ)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 278
    invoke-virtual {p3, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->deserializeTypedFromAny(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public isCachable()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public logicalType()Lcom/fasterxml/jackson/databind/type/LogicalType;
    .registers 1

    .line 283
    sget-object p0, Lcom/fasterxml/jackson/databind/type/LogicalType;->Untyped:Lcom/fasterxml/jackson/databind/type/LogicalType;

    return-object p0
.end method

.method public supportsUpdate(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Ljava/lang/Boolean;
    .registers 2

    .line 294
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_supportsUpdates:Ljava/lang/Boolean;

    return-object p0
.end method

.method protected final updateObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/JsonNode;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 436
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->isExpectedStartObjectToken()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 437
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1e

    .line 439
    :cond_b
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 440
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object p0

    .line 442
    :cond_1a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentName()Ljava/lang/String;

    move-result-object v0

    .line 444
    :goto_1e
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->getNodeFactory()Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    move-result-object v7

    :goto_22
    if-eqz v0, :cond_c7

    .line 447
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    .line 450
    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    if-eqz v2, :cond_61

    .line 452
    instance-of v3, v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v3, :cond_48

    .line 455
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_61

    iget-boolean v3, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeObjects:Z

    if-eqz v3, :cond_61

    .line 456
    move-object v1, v2

    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p0, p1, p2, v1, p4}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->updateObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    if-eq v1, v2, :cond_c1

    .line 458
    invoke-virtual {p3, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->set(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto/16 :goto_c1

    .line 462
    :cond_48
    instance-of v3, v2, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    if-eqz v3, :cond_61

    .line 465
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v1, v3, :cond_61

    iget-boolean v3, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_mergeArrays:Z

    if-eqz v3, :cond_61

    .line 468
    move-object v6, v2

    check-cast v6, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    goto/16 :goto_c1

    :cond_61
    if-nez v1, :cond_65

    .line 475
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->NOT_AVAILABLE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 478
    :cond_65
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_b1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_a3

    const/4 v3, 0x6

    if-eq v1, v3, :cond_9a

    const/4 v3, 0x7

    if-eq v1, v3, :cond_95

    packed-switch v1, :pswitch_data_c8

    .line 507
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeRareScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    goto :goto_be

    .line 501
    :pswitch_7d
    sget-object v1, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->READ_NULL_PROPERTIES:Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z

    move-result v1

    if-eqz v1, :cond_c1

    .line 504
    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v1

    goto :goto_be

    :pswitch_8a
    const/4 v1, 0x0

    .line 497
    invoke-virtual {v7, v1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v1

    goto :goto_be

    .line 494
    :pswitch_90
    invoke-virtual {v7, v2}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object v1

    goto :goto_be

    .line 491
    :cond_95
    invoke-virtual {p0, p1, p2, v7}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_fromInt(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    goto :goto_be

    .line 488
    :cond_9a
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object v1

    goto :goto_be

    .line 485
    :cond_a3
    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move-object v5, p4

    .line 484
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object v1

    goto :goto_be

    .line 481
    :cond_b1
    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move-object v5, p4

    .line 480
    invoke-virtual/range {v1 .. v6}, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;->_deserializeContainerNoRecursion(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;Lcom/fasterxml/jackson/databind/node/ContainerNode;)Lcom/fasterxml/jackson/databind/node/ContainerNode;

    move-result-object v1

    .line 518
    :goto_be
    invoke-virtual {p3, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->set(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 445
    :cond_c1
    :goto_c1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextFieldName()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_22

    :cond_c7
    return-object p3

    :pswitch_data_c8
    .packed-switch 0x9
        :pswitch_90
        :pswitch_8a
        :pswitch_7d
    .end packed-switch
.end method

###### Class com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack (com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack)
.class final Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ContainerStack"
.end annotation


# instance fields
.field private _end:I

.field private _stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

.field private _top:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 858
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final popOrNull()Lcom/fasterxml/jackson/databind/node/ContainerNode;
    .registers 3

    .line 881
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 887
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    aget-object p0, v1, v0

    return-object p0
.end method

.method public final push(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V
    .registers 5

    .line 865
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    iget v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_end:I

    if-ge v0, v1, :cond_f

    .line 866
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    aput-object p1, v1, v0

    return-void

    .line 869
    :cond_f
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    if-nez v0, :cond_1c

    const/16 v0, 0xa

    .line 870
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_end:I

    .line 871
    new-array v0, v0, [Lcom/fasterxml/jackson/databind/node/ContainerNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    goto :goto_37

    :cond_1c
    shr-int/lit8 v0, v1, 0x1

    const/16 v2, 0x14

    .line 874
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v2, 0xfa0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_end:I

    .line 875
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/node/ContainerNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 877
    :goto_37
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_stack:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    iget v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$ContainerStack;->_top:I

    aput-object p1, v0, v1

    return-void
.end method
