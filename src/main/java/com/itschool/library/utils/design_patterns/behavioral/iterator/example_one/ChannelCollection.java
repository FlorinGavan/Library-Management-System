package com.itschool.library.utils.design_patterns.behavioral.iterator.example_one;

public interface ChannelCollection {
    public  void addChannel(Channel c);
    public  void removeChannel(Channel c);
    public ChannelIterator iterator(ChannelTypeEnum type);
}
