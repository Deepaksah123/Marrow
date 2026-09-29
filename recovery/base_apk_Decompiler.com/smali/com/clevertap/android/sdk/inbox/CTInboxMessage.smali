###### Class com.clevertap.android.sdk.inbox.CTInboxMessage (com.clevertap.android.sdk.inbox.CTInboxMessage)
.class public Lcom/clevertap/android/sdk/inbox/CTInboxMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/inbox/CTInboxMessage;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:Lorg/json/JSONObject;

.field private AudioAttributesImplApi26Parcelizer:J

.field private AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private IconCompatParcelizer:Ljava/lang/String;

.field private MediaBrowserCompatCustomActionResultReceiver:J

.field private MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaDescriptionCompat:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private MediaMetadataCompat:Ljava/lang/String;

.field private RatingCompat:Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private onCommand:Lorg/json/JSONObject;

.field private onCustomAction:Lo/setAdBufferedPositionMs;

.field private read:Lorg/json/JSONObject;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 24
    new-instance v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage$5;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage$5;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    .line 137
    :try_start_18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->IconCompatParcelizer:Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi26Parcelizer:J

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RatingCompat:Ljava/lang/String;

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4b

    move-object v0, v1

    goto :goto_54

    :cond_4b
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    :goto_54
    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi21Parcelizer:Lorg/json/JSONObject;

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_5e

    move-object v0, v1

    goto :goto_67

    :cond_5e
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    :goto_67
    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_72

    move v0, v2

    goto :goto_73

    :cond_72
    const/4 v0, 0x0

    :goto_73
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatSearchResultReceiver:Z

    .line 147
    const-class v0, Lo/setAdBufferedPositionMs;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/setAdBufferedPositionMs;

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCustomAction:Lo/setAdBufferedPositionMs;

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_9a

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    .line 150
    const-class v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    goto :goto_9c

    .line 152
    :cond_9a
    iput-object v1, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    .line 154
    :goto_9c
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->write:Ljava/lang/String;

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_b9

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 157
    const-class v2, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    goto :goto_bb

    .line 159
    :cond_b9
    iput-object v1, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 161
    :goto_bb
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaMetadataCompat:Ljava/lang/String;

    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_ce

    goto :goto_d7

    :cond_ce
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    :goto_d7
    iput-object v1, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCommand:Lorg/json/JSONObject;
    :try_end_d9
    .catch Lorg/json/JSONException; {:try_start_18 .. :try_end_d9} :catch_da

    return-void

    :catch_da
    move-exception p0

    .line 165
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 21
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 74
    const-string v2, "value"

    const-string v3, "key"

    const-string v4, "orientation"

    const-string v5, "custom_kv"

    const-string v6, "content"

    const-string v7, "bg"

    const-string v8, "wzrkParams"

    const-string v9, "type"

    const-string v10, "msg"

    const-string v11, "tags"

    const-string v12, "isRead"

    const-string v13, "wzrk_ttl"

    const-string v14, "date"

    const-string v15, "wzrk_id"

    move-object/from16 v16, v8

    const-string v8, "id"

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v17, v4

    .line 44
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    iput-object v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 62
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    .line 75
    iput-object v1, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi21Parcelizer:Lorg/json/JSONObject;

    .line 77
    :try_start_40
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4b

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_4a
    .catch Lorg/json/JSONException; {:try_start_40 .. :try_end_4a} :catch_171

    goto :goto_4d

    :cond_4b
    const-string v4, "0"

    :goto_4d
    :try_start_4d
    iput-object v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RatingCompat:Ljava/lang/String;

    .line 78
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5a

    .line 79
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_59
    .catch Lorg/json/JSONException; {:try_start_4d .. :try_end_59} :catch_171

    goto :goto_5c

    :cond_5a
    const-string v4, "0_0"

    :goto_5c
    :try_start_5c
    iput-object v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 80
    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_69

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    goto :goto_71

    .line 81
    :cond_69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    const-wide/16 v18, 0x3e8

    div-long v14, v14, v18

    :goto_71
    iput-wide v14, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 82
    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7e

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    goto :goto_87

    .line 83
    :cond_7e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    const-wide/32 v18, 0x5265c00

    add-long v13, v13, v18

    :goto_87
    iput-wide v13, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi26Parcelizer:J

    .line 84
    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    const/4 v8, 0x0

    if-eqz v4, :cond_98

    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_98

    const/4 v4, 0x1

    goto :goto_99

    :cond_98
    move v4, v8

    :goto_99
    iput-boolean v4, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatSearchResultReceiver:Z

    .line 85
    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    const/4 v12, 0x0

    if-eqz v4, :cond_a7

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    goto :goto_a8

    :cond_a7
    move-object v4, v12

    :goto_a8
    if-eqz v4, :cond_bd

    move v11, v8

    .line 88
    :goto_ab
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v13

    if-ge v11, v13, :cond_bd

    .line 89
    iget-object v13, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    invoke-virtual {v4, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_ab

    .line 92
    :cond_bd
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c8

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_c9

    :cond_c8
    move-object v4, v12

    :goto_c9
    if-eqz v4, :cond_162

    .line 95
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10
    :try_end_cf
    .catch Lorg/json/JSONException; {:try_start_5c .. :try_end_cf} :catch_171

    const-string v11, ""

    if-eqz v10, :cond_dc

    .line 96
    :try_start_d3
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lo/setAdBufferedPositionMs;->read(Ljava/lang/String;)Lo/setAdBufferedPositionMs;

    move-result-object v9

    goto :goto_e0

    :cond_dc
    invoke-static {v11}, Lo/setAdBufferedPositionMs;->read(Ljava/lang/String;)Lo/setAdBufferedPositionMs;

    move-result-object v9

    :goto_e0
    iput-object v9, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCustomAction:Lo/setAdBufferedPositionMs;

    .line 97
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_ed

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_ee

    :cond_ed
    move-object v7, v11

    :goto_ee
    iput-object v7, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->write:Ljava/lang/String;

    .line 98
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_fb

    .line 99
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    goto :goto_fc

    :cond_fb
    move-object v6, v12

    :goto_fc
    if-eqz v6, :cond_11a

    move v7, v8

    .line 101
    :goto_ff
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v7, v9, :cond_11a

    .line 102
    new-instance v9, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    invoke-direct {v9}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;-><init>()V

    .line 103
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->MediaBrowserCompatCustomActionResultReceiver(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    move-result-object v9

    .line 104
    iget-object v10, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_ff

    .line 108
    :cond_11a
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_125

    .line 109
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    goto :goto_126

    :cond_125
    move-object v5, v12

    :goto_126
    if-eqz v5, :cond_154

    .line 111
    :goto_128
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v8, v6, :cond_154

    .line 112
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 113
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_151

    .line 114
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 115
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_151

    .line 116
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 118
    iget-object v9, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    const-string v10, "text"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_151
    add-int/lit8 v8, v8, 0x1

    goto :goto_128

    :cond_154
    move-object/from16 v2, v17

    .line 125
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_160

    .line 126
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :cond_160
    iput-object v11, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaMetadataCompat:Ljava/lang/String;

    :cond_162
    move-object/from16 v2, v16

    .line 128
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16e

    .line 129
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    :cond_16e
    iput-object v12, v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCommand:Lorg/json/JSONObject;
    :try_end_170
    .catch Lorg/json/JSONException; {:try_start_d3 .. :try_end_170} :catch_171

    return-void

    :catch_171
    move-exception v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 179
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->write:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 269
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 260
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaMetadataCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Lo/setAdBufferedPositionMs;
    .registers 1

    .line 277
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCustomAction:Lo/setAdBufferedPositionMs;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/util/ArrayList;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lo/SimpleBasePlayerState;",
            ">;"
        }
    .end annotation

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RemoteActionCompatParcelizer()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;

    .line 198
    invoke-virtual {v1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v2

    .line 199
    new-instance v3, Lo/SimpleBasePlayerState;

    invoke-virtual {v1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;->AudioAttributesImplApi21Parcelizer()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Lo/SimpleBasePlayerState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_2a
    return-object v0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 290
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatSearchResultReceiver:Z

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Lorg/json/JSONObject;
    .registers 1

    .line 286
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCommand:Lorg/json/JSONObject;

    if-nez p0, :cond_9

    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    :cond_9
    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()V
    .registers 2

    const/4 v0, 0x1

    .line 294
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Ljava/util/ArrayList;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/inbox/CTInboxMessageContent;",
            ">;"
        }
    .end annotation

    .line 246
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    return-object p0
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()J
    .registers 3

    .line 227
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatCustomActionResultReceiver:J

    return-wide v0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 250
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RatingCompat:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 299
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 300
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 301
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 302
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 303
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatCustomActionResultReceiver:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 304
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi26Parcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 305
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->RatingCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 306
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi21Parcelizer:Lorg/json/JSONObject;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_2d

    .line 307
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_39

    .line 309
    :cond_2d
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 310
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesImplApi21Parcelizer:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 312
    :goto_39
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    if-nez p2, :cond_41

    .line 313
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_4d

    .line 315
    :cond_41
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 316
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->read:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 318
    :goto_4d
    iget-boolean p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatSearchResultReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 319
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCustomAction:Lo/setAdBufferedPositionMs;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 320
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    if-nez p2, :cond_60

    .line 321
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_68

    .line 323
    :cond_60
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 324
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaDescriptionCompat:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 326
    :goto_68
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 327
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    if-nez p2, :cond_75

    .line 328
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_7d

    .line 330
    :cond_75
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 331
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 333
    :goto_7d
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 334
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 335
    iget-object p2, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCommand:Lorg/json/JSONObject;

    if-nez p2, :cond_8f

    .line 336
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    return-void

    .line 338
    :cond_8f
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    .line 339
    iget-object p0, p0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;->onCommand:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inbox.CTInboxMessage.AnonymousClass5 (com.clevertap.android.sdk.inbox.CTInboxMessage$5)
.class final Lcom/clevertap/android/sdk/inbox/CTInboxMessage$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inbox/CTInboxMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inbox/CTInboxMessage;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inbox/CTInboxMessage;
    .registers 3

    .line 27
    new-instance v0, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Lcom/clevertap/android/sdk/inbox/CTInboxMessage;
    .registers 1

    .line 32
    new-array p0, p0, [Lcom/clevertap/android/sdk/inbox/CTInboxMessage;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 24
    invoke-static {p1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage$5;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inbox/CTInboxMessage;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 24
    invoke-static {p1}, Lcom/clevertap/android/sdk/inbox/CTInboxMessage$5;->RemoteActionCompatParcelizer(I)[Lcom/clevertap/android/sdk/inbox/CTInboxMessage;

    move-result-object p0

    return-object p0
.end method
