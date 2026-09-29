###### Class com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit (com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit)
.class public Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:Lo/lambdasetPlaybackParameters11;

.field private IconCompatParcelizer:Lorg/json/JSONObject;

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;",
            ">;"
        }
    .end annotation
.end field

.field private read:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 21
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit$1;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit$1;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    :try_start_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 123
    const-class v0, Lo/lambdasetPlaybackParameters11;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/lambdasetPlaybackParameters11;

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesImplApi21Parcelizer:Lo/lambdasetPlaybackParameters11;

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->write:Ljava/lang/String;

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_36

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    .line 128
    const-class v1, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    goto :goto_38

    .line 130
    :cond_36
    iput-object v2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    .line 133
    :goto_38
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->read:Ljava/util/HashMap;

    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_45

    goto :goto_4e

    :cond_45
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    :goto_4e
    iput-object v2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->IconCompatParcelizer:Lorg/json/JSONObject;

    .line 135
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_56} :catch_57

    return-void

    :catch_57
    move-exception p1

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error Creating Display Unit from parcel : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 138
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 19
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;Lo/lambdasetPlaybackParameters11;Ljava/lang/String;Ljava/util/ArrayList;Lorg/json/JSONObject;Ljava/lang/String;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Lo/lambdasetPlaybackParameters11;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;",
            ">;",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->IconCompatParcelizer:Lorg/json/JSONObject;

    .line 111
    iput-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 112
    iput-object p3, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesImplApi21Parcelizer:Lo/lambdasetPlaybackParameters11;

    .line 113
    iput-object p4, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->write:Ljava/lang/String;

    .line 114
    iput-object p5, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    .line 115
    invoke-static {p6}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->write(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->read:Ljava/util/HashMap;

    .line 116
    iput-object p7, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method public static RemoteActionCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;
    .registers 14

    .line 72
    const-string v0, "custom_kv"

    const-string v1, "content"

    const-string v2, "bg"

    const-string v3, "type"

    const-string v4, "wzrk_id"

    :try_start_a
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_15

    .line 73
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_14} :catch_80

    goto :goto_17

    :cond_15
    const-string v4, "0_0"

    :goto_17
    move-object v7, v4

    .line 74
    :try_start_18
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_29

    .line 75
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/lambdasetPlaybackParameters11;->RemoteActionCompatParcelizer(Ljava/lang/String;)Lo/lambdasetPlaybackParameters11;

    move-result-object v3

    move-object v8, v3

    goto :goto_2a

    :cond_29
    move-object v8, v5

    .line 77
    :goto_2a
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_35

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_34} :catch_80

    goto :goto_37

    :cond_35
    const-string v2, ""

    :goto_37
    move-object v9, v2

    .line 79
    :try_start_38
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_43

    .line 80
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_44

    :cond_43
    move-object v1, v5

    .line 81
    :goto_44
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_6a

    const/4 v2, 0x0

    .line 83
    :goto_4c
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_6a

    .line 85
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->write(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    move-result-object v3

    .line 86
    invoke-virtual {v3}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;->read()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_67

    .line 87
    invoke-virtual {v10, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_67
    add-int/lit8 v2, v2, 0x1

    goto :goto_4c

    .line 93
    :cond_6a
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_76

    .line 94
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object v11, v0

    goto :goto_77

    :cond_76
    move-object v11, v5

    .line 96
    :goto_77
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    const/4 v12, 0x0

    move-object v5, v0

    move-object v6, p0

    invoke-direct/range {v5 .. v12}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Lo/lambdasetPlaybackParameters11;Ljava/lang/String;Ljava/util/ArrayList;Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_7f
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_7f} :catch_80

    return-object v0

    :catch_80
    move-exception p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 99
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error Creating Display Unit from JSON : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    new-instance v1, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Lo/lambdasetPlaybackParameters11;Ljava/lang/String;Ljava/util/ArrayList;Lorg/json/JSONObject;Ljava/lang/String;)V

    return-object v1
.end method

.method private static write(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_33

    .line 296
    :try_start_3
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    if-eqz v1, :cond_33

    move-object v2, v0

    .line 300
    :cond_a
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 301
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 302
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 303
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    if-nez v2, :cond_27

    .line 305
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 307
    :cond_27
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_2a} :catch_2c

    goto :goto_a

    :cond_2b
    return-object v2

    :catch_2c
    move-exception p0

    .line 315
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    :cond_33
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Ljava/lang/String;
    .registers 1

    .line 178
    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .line 238
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    const-string v1, " Unit id- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    const-string v1, ", Type- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesImplApi21Parcelizer:Lo/lambdasetPlaybackParameters11;

    if-eqz v1, :cond_22

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_23

    :cond_22
    const/4 v1, 0x0

    :goto_23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    const-string v1, ", bgColor- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->write:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    if-eqz v1, :cond_69

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_69

    const/4 v1, 0x0

    .line 244
    :goto_3b
    iget-object v2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_69

    .line 245
    iget-object v2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnitContent;

    if-eqz v2, :cond_66

    .line 247
    const-string v3, ", Content Item:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_66
    add-int/lit8 v1, v1, 0x1

    goto :goto_3b

    .line 252
    :cond_69
    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->read:Ljava/util/HashMap;

    if-eqz v1, :cond_77

    .line 253
    const-string v1, ", Custom KV:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->read:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    :cond_77
    const-string v1, ", JSON -"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->IconCompatParcelizer:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    const-string v1, ", Error-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    const-string v1, " ]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_94
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_94} :catch_95

    return-object p0

    .line 260
    :catch_95
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 262
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 206
    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 267
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 268
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesImplApi21Parcelizer:Lo/lambdasetPlaybackParameters11;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 269
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 271
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_19

    .line 272
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_21

    .line 274
    :cond_19
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 275
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 278
    :goto_21
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->read:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 279
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->IconCompatParcelizer:Lorg/json/JSONObject;

    if-nez p2, :cond_2e

    .line 280
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_3a

    .line 282
    :cond_2e
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 283
    iget-object p2, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->IconCompatParcelizer:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 285
    :goto_3a
    iget-object p0, p0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit.AnonymousClass1 (com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit$1)
.class final Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;
    .registers 1

    .line 29
    new-array p0, p0, [Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;
    .registers 3

    .line 24
    new-instance v0, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 21
    invoke-static {p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit$1;->IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 21
    invoke-static {p1}, Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit$1;->AudioAttributesCompatParcelizer(I)[Lcom/clevertap/android/sdk/displayunits/model/CleverTapDisplayUnit;

    move-result-object p0

    return-object p0
.end method
