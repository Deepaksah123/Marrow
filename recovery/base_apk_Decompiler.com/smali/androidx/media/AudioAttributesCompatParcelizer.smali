###### Class androidx.media.AudioAttributesCompatParcelizer (androidx.media.AudioAttributesCompatParcelizer)
.class public Landroidx/media/AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesCompat;
    .registers 3

    .line 11
    new-instance v0, Landroidx/media/AudioAttributesCompat;

    invoke-direct {v0}, Landroidx/media/AudioAttributesCompat;-><init>()V

    .line 12
    iget-object v1, v0, Landroidx/media/AudioAttributesCompat;->write:Landroidx/media/AudioAttributesImpl;

    invoke-virtual {p0, v1}, Lo/getAllPermissionGroups;->read(Lo/getApplicationInfo;)Lo/getApplicationInfo;

    move-result-object p0

    check-cast p0, Landroidx/media/AudioAttributesImpl;

    iput-object p0, v0, Landroidx/media/AudioAttributesCompat;->write:Landroidx/media/AudioAttributesImpl;

    return-object v0
.end method

.method public static write(Landroidx/media/AudioAttributesCompat;Lo/getAllPermissionGroups;)V
    .registers 2

    .line 19
    iget-object p0, p0, Landroidx/media/AudioAttributesCompat;->write:Landroidx/media/AudioAttributesImpl;

    invoke-virtual {p1, p0}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Lo/getApplicationInfo;)V

    return-void
.end method
